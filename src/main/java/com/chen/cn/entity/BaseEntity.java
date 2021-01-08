package com.chen.cn.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author Ll
 * @Date 2021/1/6 22:40
 */

@Data
public class BaseEntity {
    private Long id;

    private LocalDateTime createTime;

    private Long createId;

    private LocalDateTime updateTime;

    private Long updateId;

    public void setDate() {
        if (id == null) {
            this.createId = 1L;
            this.createTime = LocalDateTime.now();
        } else {
            this.updateId = 2L;
            this.updateTime = LocalDateTime.now();
        }
    }
}
