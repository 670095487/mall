package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.Logs;
import com.mall.mall01.mbg.model.LogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogsMapper {
    int countByExample(LogsExample example);

    int deleteByExample(LogsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Logs record);

    int insertSelective(Logs record);

    List<Logs> selectByExample(LogsExample example);

    Logs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Logs record, @Param("example") LogsExample example);

    int updateByExample(@Param("record") Logs record, @Param("example") LogsExample example);

    int updateByPrimaryKeySelective(Logs record);

    int updateByPrimaryKey(Logs record);
}