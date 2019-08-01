package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class UserAwardMap {
    private Long userAwardId;
    private Long userId;
    private Long awardId;
    private Long shopId;
    private String userName;
    private String awardName;
    private Date expireTime;
    private Date createTime;
    private Integer usedStatus;
    private Integer point;
    private PersonInfo user;
    private Award award;
    private Shop shop;


}
