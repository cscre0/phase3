package com.chen.cn.dto;

import com.chen.cn.enums.AxiosStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.HashMap;

/**
 * @Author Ll
 * @Date 2020/12/22 21:18
 */

@Data
/*转json时,只转值不为null的*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {

    private int status;

    private String message;

    private T data;

    /*私有构造*/
    private AxiosResult() {
    }

    public static AxiosResult success() {
        return setData(AxiosStatus.SUCCESS, null);
    }

    public static AxiosResult success(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    public static AxiosResult fail() {
        return setData(AxiosStatus.FAILURE,null);
    }

    public static AxiosResult fail(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    public static <T> AxiosResult<T> success(T data) {
        return setData(AxiosStatus.SUCCESS, data);
    }

    public static <T> AxiosResult<T> success(T data, AxiosStatus axiosStatus) {
        return setData(axiosStatus, data);
    }

    public static <T> AxiosResult<T> fail(T data) {
        return setData(AxiosStatus.FAILURE, data);
    }

    public static <T> AxiosResult<T> fail(T data, AxiosStatus axiosStatus) {
        return setData(axiosStatus, data);
    }

    /**
     * 封装数据公共方法
     *
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus, T data) {
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        return axiosResult;
    }


}
