package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.UserShopMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserShopMapRepository {
	/**
	 * 
	 * @param userShopCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<UserShopMap> queryUserShopMapList(
			@Param("userShopCondition") UserShopMap userShopCondition,
			@Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

	UserShopMap queryUserShopMap(@Param("userId") long userId,
			@Param("shopId") long shopId);

	/**
	 * 
	 * @param userShopCondition
	 * @return
	 */
	int queryUserShopMapCount(
			@Param("userShopCondition") UserShopMap userShopCondition);

	/**
	 * 
	 * @param userShopMap
	 * @return
	 */
	int insertUserShopMap(UserShopMap userShopMap);

	/**
	 * 
	 * @param userShopMap
	 * @return
	 */
	int updateUserShopMapPoint(UserShopMap userShopMap);

}
