package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.ProductImg;

import java.util.List;

public interface ProductImgRepository {

	List<ProductImg> queryProductImgList(long productId);

	int batchInsertProductImg(List<ProductImg> productImgList);

	int deleteProductImgByProductId(long productId);
}
