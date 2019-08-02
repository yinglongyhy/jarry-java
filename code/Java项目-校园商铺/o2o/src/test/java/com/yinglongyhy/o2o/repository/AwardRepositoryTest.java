package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.Award;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AwardRepositoryTest {

    @Autowired
    private AwardRepository awardRepository;

    @Test
    public void testQueryAwardList() {
        Award award = new Award();
        List<Award> awardList = awardRepository.queryAwardList(award, 0, 3);
        assertEquals(1, awardList.size());
        int count = awardRepository.queryAwardCount(award);
        assertEquals(1, count);
        award.setAwardName("测试");
        awardList = awardRepository.queryAwardList(award, 0, 3);
        assertEquals(1, awardList.size());
        count = awardRepository.queryAwardCount(award);
        assertEquals(1, count);
    }

    @Test
    public void testQueryAwardByAwardId() {
        Award awardCondition = new Award();
        awardCondition.setAwardName("测试");
        List<Award> awardList = awardRepository.queryAwardList(awardCondition, 0, 1);
        assertEquals(1, awardList.size());
        Award award = awardRepository.queryAwardByAwardId(awardList.get(0)
                .getAwardId());
        assertEquals("测试一", award.getAwardName());
    }

    @Test
    public void testInsertAward() {
        long shopId = 15;
        Award award = new Award();
        award.setAwardName("测试一");
        award.setAwardImg("test1");
        award.setPoint(5);
        award.setPriority(1);
        award.setEnableStatus(1);
        award.setCreateTime(new Date());
        award.setLastEditTime(new Date());
        award.setExpireTime(new Date());
        award.setShopId(shopId);
        int effectedNum = awardRepository.insertAward(award);
        assertEquals(1, effectedNum);

        testQueryAwardList();
    }




}
