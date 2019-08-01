package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AreaRepositoryTest {

    @Autowired
    private AreaRepository areaRepository;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaRepository.queryArea();
        areaList.forEach(System.out::println);
        assertTrue(areaList.size() > 0);
    }

    @Test
    public void testInsertArea() {
        Area area = new Area();
        area.setAreaName("区域一");
        area.setAreaDesc("区域一");
        area.setPriority(1);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        int effectedNum = areaRepository.insertArea(area);
        assertEquals(1, effectedNum);

        List<Area> areaList = areaRepository.queryArea();
        areaList.forEach(System.out::println);
    }

    @Test
    public void testUpdateArea() {
        Area area = new Area();
        area.setAreaId(4L);
        area.setAreaName("南苑");
        area.setLastEditTime(new Date());
        int effectedNum = areaRepository.updateArea(area);
        assertEquals(1, effectedNum);

        testQueryArea();
    }

    @Test
    public void testDeleteArea() {
        Area area = new Area();
        area.setAreaName("区域一");
        area.setAreaDesc("区域一");
        area.setPriority(1);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        areaRepository.insertArea(area);

        testQueryArea();

        long areaId = -1;
        List<Area> areaList = areaRepository.queryArea();
        for (Area myArea : areaList) {
            if ("区域一".equals(myArea.getAreaName())) {
                areaId = myArea.getAreaId();
            }
        }
        int effectedNum = areaRepository.deleteArea(areaId);
        assertEquals(1, effectedNum);

        testQueryArea();
    }

    @Test
    public void testBatchDeleteArea() {
        Area area = new Area();
        area.setAreaName("区域一");
        area.setAreaDesc("区域一");
        area.setPriority(1);
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        areaRepository.insertArea(area);

        testQueryArea();

        long areaId = -1;
        List<Area> areaList = areaRepository.queryArea();
        for (Area myArea : areaList) {
            if ("区域一".equals(myArea.getAreaName())) {
                areaId = myArea.getAreaId();
            }
        }
        ArrayList<Long> areaIdList = new ArrayList<>();
        areaIdList.add(areaId);
        int effectedNum = areaRepository.batchDeleteArea(areaIdList);
        assertEquals(1, effectedNum);

        testQueryArea();

    }
}
