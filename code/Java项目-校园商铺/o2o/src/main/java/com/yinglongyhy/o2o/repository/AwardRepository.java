package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.Award;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AwardRepository {
	List<Award> queryAwardList(@Param("awardCondition") Award awardCondition,
							   @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

	int queryAwardCount(@Param("awardCondition") Award awardCondition);

	Award queryAwardByAwardId(long awardId);

	int insertAward(Award award);

	int updateAward(Award award);

	int deleteAward(long awardId);
}
