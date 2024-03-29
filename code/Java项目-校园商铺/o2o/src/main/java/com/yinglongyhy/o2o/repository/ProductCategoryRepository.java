package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.ProductCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository {
	/**
	 * 通过employee id 查询店铺
	 * 
	 * @param long shopId
	 * @return List<ProductCategory>
	 */
	List<ProductCategory> queryByShopId(long shopId);

	/**
	 * 新增商品类别
	 * 
	 * @param ProductCategory
	 *            productCategory
	 * @return effectedNum
	 */
	int batchInsertProductCategory(List<ProductCategory> productCategoryList);

	/**
	 * 删除商品类别（初版，即只支持删除尚且没有发布商品的商品类别）
	 * 
	 * @param productCategoryId
	 * @param shopId
	 * @return effectedNum
	 */
	int deleteProductCategory(
			@Param("productCategoryId") long productCategoryId,
			@Param("shopId") long shopId);
}
