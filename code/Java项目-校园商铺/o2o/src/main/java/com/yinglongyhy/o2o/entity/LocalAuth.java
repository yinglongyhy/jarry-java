package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class LocalAuth {
    private Long lacalAuthId;
    private String userName;
    private String password;
    private Long userId;
    private Date CreateTime;
    private Date lastEditTime;
    private PersonInfo personInfo;
}
