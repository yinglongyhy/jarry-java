package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter@Setter
@ToString
public class Area {
    private Long areaId;
    private String areaName;
    private String areaDesc;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
}
