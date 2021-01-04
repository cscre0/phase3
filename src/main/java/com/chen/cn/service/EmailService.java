package com.chen.cn.service;

import com.chen.cn.cache.MyRedisCache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @Author Ll
 * @Date 2020/12/25 15:14
 */

@Service
@Slf4j
@Async
public class EmailService {

    @Autowired
    private MyRedisCache redisCache;
    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.from}")
    private String from;

    /**
     * 验证码或者普通邮件
     *
     * @param subject
     * @param to
     * @param content
     * @param randomNum
     */

    public void simpleEmail(String subject, String to, String content, String randomNum) {
        System.out.println(Thread.currentThread().getName());

        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

            simpleMailMessage.setFrom(from);
            simpleMailMessage.setTo(to);
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setText(content);

            if (randomNum != null && randomNum != "") {
                //失效时间
                redisCache.timeoutCache(to, randomNum + "");
            }
            //无论如何都发邮件
            javaMailSender.send(simpleMailMessage);
        } catch (MailException e) {
            log.error("simple邮件发送失败: "+e.getMessage());
        }
    }

    /**
     * freemarker,阿里云邮箱
     *
     * @param subject
     * @param to
     * @param content
     * @throws MessagingException
     */
    public void enclosureEmail(String subject, String to, String content, String uuid) throws MessagingException {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();

            //用MimeMessageHelper给MimeMessage消息封装值,设置发邮件的编码
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, "utf-8");

            mimeMessageHelper.setFrom("网易邮箱<vb7977797@163.com>");
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);

                /*mimeMessageHelper.setText("<a herf=`http://localhost:8080/employee/Active?uuid=`" + s +
                        ">点击激活</a>",true);*/

            mimeMessageHelper.setText(content, true);

            javaMailSender.send(mimeMessage);

            redisCache.timeoutCache(uuid, to, 5);
        } catch (Exception e) {
            log.error("mime邮件发送失败: "+e.getMessage());
        }

    }
}
