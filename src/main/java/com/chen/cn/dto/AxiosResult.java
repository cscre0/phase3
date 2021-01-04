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

    /*私有构造方法*/
    private AxiosResult(AxiosStatus axiosStatus) {
        AxiosResult axiosResult = new AxiosResult(axiosStatus);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
    }

    public static AxiosResult success() {
        return new AxiosResult(AxiosStatus.SUCCESS);
    }

    public static AxiosResult success(AxiosStatus axiosStatus) {
        return new AxiosResult(axiosStatus);
    }

    public static AxiosResult fail() {
        return new AxiosResult(AxiosStatus.FAILURE);
    }

    public static AxiosResult fail(AxiosStatus axiosStatus) {
        return new AxiosResult(axiosStatus);
    }

    public static <T> AxiosResult<T> success(T data) {
        AxiosResult success = success();
        success.setData(data);
        return success;
    }

    public static <T> AxiosResult<T> success(T data, AxiosStatus axiosStatus) {
        AxiosResult success = success(axiosStatus);
        success.setData(data);
        return success;
    }

    public static <T> AxiosResult<T> fail(T data) {
        AxiosResult fail = fail();
        fail.setData(data);
        return fail;
    }

    public static <T> AxiosResult<T> fail(T data, AxiosStatus axiosStatus) {
        AxiosResult fail = fail(axiosStatus);
        fail.setData(data);
        return fail;
    }


}
