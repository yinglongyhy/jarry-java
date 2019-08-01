package com.yinglongyhy.o2o.repository;

import com.yinglongyhy.o2o.entity.Area;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository {

    @Select("select * from tb_area order by priority desc")
    List<Area> queryArea();

    @Insert("insert into tb_area(area_name, area_desc, priority, create_time, last_edit_time) " +
            "values (#{areaName}, #{areaDesc}, #{priority}, #{createTime}, #{lastEditTime})")
    int insertArea(Area area);

    @Update("<script>" +
            "update tb_area" +
            "<set>" +
            "   <if test=\"areaName != null\">area_name=#{areaName},</if>" +
            "   <if test=\"areaDesc != null\">area_desc=#{areaDesc},</if>" +
            "   <if test=\"priority != null\">priority=#{priority},</if>" +
            "   <if test=\"lastEditTime != null\">last_edit_time=#{lastEditTime}</if>" +
            "</set>" +
            "where area_id=#{areaId}" +
            "</script>")
    int updateArea(Area area);

    @Delete("delete from tb_area where area_id=#{areaId}")
    int deleteArea(long areaId);

    @Delete("<script> delete from tb_area where area_id in " +
            "<foreach collection='list' item='areaId' open='(' separator=',' close=')'>" +
            "#{areaId}" +
            "</foreach>" +
            " </script>")
    int batchDeleteArea(List<Long> areaIdList);
}
