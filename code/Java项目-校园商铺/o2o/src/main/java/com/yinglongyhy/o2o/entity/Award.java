package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
public class Award {
    private Long awardId;
    private String awardName;
    private String awardImg;
    private Integer point;
    private Integer priority;
    private Date createTime;
    private Date LastEditTime;
    private Integer enableStatus;
    private Long shopId;
}
