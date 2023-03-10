package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.FlywaySchemaHistory;
import com.mall.mall01.mbg.model.FlywaySchemaHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlywaySchemaHistoryMapper {
    int countByExample(FlywaySchemaHistoryExample example);

    int deleteByExample(FlywaySchemaHistoryExample example);

    int deleteByPrimaryKey(Integer installedRank);

    int insert(FlywaySchemaHistory record);

    int insertSelective(FlywaySchemaHistory record);

    List<FlywaySchemaHistory> selectByExample(FlywaySchemaHistoryExample example);

    FlywaySchemaHistory selectByPrimaryKey(Integer installedRank);

    int updateByExampleSelective(@Param("record") FlywaySchemaHistory record, @Param("example") FlywaySchemaHistoryExample example);

    int updateByExample(@Param("record") FlywaySchemaHistory record, @Param("example") FlywaySchemaHistoryExample example);

    int updateByPrimaryKeySelective(FlywaySchemaHistory record);

    int updateByPrimaryKey(FlywaySchemaHistory record);
}