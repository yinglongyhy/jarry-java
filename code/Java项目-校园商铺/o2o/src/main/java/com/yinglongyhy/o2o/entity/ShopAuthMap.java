package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class ShopAuthMap {
    private Long shopAuthId;
    private Long employeeId;
    private Long shopId;
    private String name;
    private String title;
    private Integer titleFlag;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
    private PersonInfo employee;
    private Shop shop;


}
