package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.HeadLine;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeadLineRepository {

	/**
	 * 
	 * @return
	 */
	List<HeadLine> queryHeadLine(
			@Param("headLineCondition") HeadLine headLineCondition);

	/**
	 * 
	 * @param lineId
	 * @return
	 */
	HeadLine queryHeadLineById(long lineId);

	/**
	 * 
	 * @param lineIdList
	 * @return
	 */
	List<HeadLine> queryHeadLineByIds(List<Long> lineIdList);

	/**
	 * 
	 * @param headLine
	 * @return
	 */
	int insertHeadLine(HeadLine headLine);

	/**
	 * 
	 * @param headLine
	 * @return
	 */
	int updateHeadLine(HeadLine headLine);

	/**
	 * 
	 * @param headLineId
	 * @return
	 */
	int deleteHeadLine(long headLineId);

	/**
	 * 
	 * @param lineIdList
	 * @return
	 */
	int batchDeleteHeadLine(List<Long> lineIdList);
}
