package com.chen.cn.enums;

/**
 * @Author Ll
 * @Date 2020/12/22 21:14
 */


public enum AxiosStatus {
    SUCCESS(2000,"操作成功"),
    EMAIL_SENDEN(2001,"激活邮件已发送"),
    FAILURE(4000,"操作失败"),
    EMPLOYEE_NOT_EXISTS(4001,"员工不存在"),
    ADMIN_NOT_EXISTS(4005,"管理员不存在"),
    INACTIVED(4002, "账号未激活"),
    ACTIVED(4003,"账号已激活,请登录"),
    LINK_DISABLED(4004,"链接已失效"),
    CODE_NOT_RIGHT(4006,"验证码不正确"),

    ;

    private int status;
    private String message;

    AxiosStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
