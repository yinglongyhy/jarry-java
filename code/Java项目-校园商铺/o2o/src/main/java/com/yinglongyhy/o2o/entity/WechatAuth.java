package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class WechatAuth {
    private Long wechatAuthId;
    private Long userId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;


}
