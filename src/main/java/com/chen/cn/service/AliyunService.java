package com.chen.cn.service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.model.OSSObject;
import com.chen.cn.config.OSSConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.util.Date;

/**
 * @Author Ll
 * @Date 2020/12/23 20:40
 */

@Service
@Slf4j
public class AliyunService {

    @Autowired
    private OSSConfiguration ossConfiguration;
    @Autowired
    private OSS ossClient;

    /**
     * 上传文件
     *
     * @param fileName
     * @param inputStream
     * @return
     */
    public String uploadFile(String fileName, InputStream inputStream) {

        try {
            ossClient.putObject(ossConfiguration.getBucketName(), fileName, inputStream);

            ossClient.shutdown();

            String result = ossConfiguration.getBaseUrl() + fileName;

            return result;
        } catch (Exception e) {
            log.error("上传失败: " + e.getMessage());
        }
        return null;
    }

    /**
     * 下载文件
     * @param os
     * @param fileName
     */
    public void exportFile(OutputStream os, String fileName) {
        // ossObject包含文件所在的存储空间名称、文件名称、文件元信息以及一个输入流
        OSSObject ossObject = ossClient.getObject(ossConfiguration.getBucketName(), fileName);
        // 读取文件内容
        BufferedInputStream in = new BufferedInputStream(ossObject.getObjectContent());
        BufferedOutputStream out = new BufferedOutputStream(os);
        byte[] buffer = new byte[1024];
        int lenght;
        try {
            while ((lenght = in.read(buffer)) != -1) {
                out.write(buffer, 0, lenght);
            }
            out.flush();
        } catch (IOException e) {
            log.error("下载失败: ", e.getMessage());
        }
    }

    /**
     * 删除文件
     * @param fileName
     */
    public void deleteFile(String fileName) {
        try {
            ossClient.deleteObject(ossConfiguration.getBucketName(), fileName);
        } catch (Exception e) {
            log.error("删除失败: ", e.getMessage());
        }
    }

    /**
     * 文件访问
     * @param filename
     * @return
     */
    public String getSingeNatureUrl(String filename) {
        int expSeconds=3600;
        Date expiration = new Date(System.currentTimeMillis() + expSeconds * 1000);
        URL url = ossClient.generatePresignedUrl(ossConfiguration.getBucketName(), filename, expiration);
        if (url != null) {
            return url.toString();
        }
        return null;
    }
}
