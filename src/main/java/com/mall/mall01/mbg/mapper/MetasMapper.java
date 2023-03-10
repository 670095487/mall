package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.Metas;
import com.mall.mall01.mbg.model.MetasExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MetasMapper {
    int countByExample(MetasExample example);

    int deleteByExample(MetasExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Metas record);

    int insertSelective(Metas record);

    List<Metas> selectByExample(MetasExample example);

    Metas selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Metas record, @Param("example") MetasExample example);

    int updateByExample(@Param("record") Metas record, @Param("example") MetasExample example);

    int updateByPrimaryKeySelective(Metas record);

    int updateByPrimaryKey(Metas record);
}