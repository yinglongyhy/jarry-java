package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.ProductImg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductImgRepository {

	List<ProductImg> queryProductImgList(long productId);

	int batchInsertProductImg(List<ProductImg> productImgList);

	int deleteProductImgByProductId(long productId);
}
