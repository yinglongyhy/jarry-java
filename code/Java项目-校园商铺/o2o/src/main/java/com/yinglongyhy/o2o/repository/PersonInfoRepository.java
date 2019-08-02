package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.PersonInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonInfoRepository {

	/**
	 * 
	 * @param personInfoCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<PersonInfo> queryPersonInfoList(
			@Param("personInfoCondition") PersonInfo personInfoCondition,
			@Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

	/**
	 * 
	 * @param personInfoCondition
	 * @return
	 */
	int queryPersonInfoCount(
			@Param("personInfoCondition") PersonInfo personInfoCondition);

	/**
	 * 
	 * @param userId
	 * @return
	 */
	PersonInfo queryPersonInfoById(long userId);

	/**
	 * 
	 * @param wechatAuth
	 * @return
	 */
	int insertPersonInfo(PersonInfo personInfo);

	/**
	 * 
	 * @param wechatAuth
	 * @return
	 */
	int updatePersonInfo(PersonInfo personInfo);

	/**
	 * 
	 * @param wechatAuth
	 * @return
	 */
	int deletePersonInfo(long userId);
}
