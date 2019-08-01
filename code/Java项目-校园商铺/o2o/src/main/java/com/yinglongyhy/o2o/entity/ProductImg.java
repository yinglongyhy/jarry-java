package com.yinglongyhy.o2o.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class ProductImg {
    private Long productImgId;
    private String imgAddr;
    private String imgDesc;
    private Integer priority;
    private Date createTime;
    private Long productId;

}
