package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class UserShopMap {
    private Long userShopId;
    private Long userId;
    private Long shopId;
    private String userName;
    private String shopName;
    private Date createTime;
    private Integer point;
    private PersonInfo user;
    private Product product;
    private Shop shop;


}
