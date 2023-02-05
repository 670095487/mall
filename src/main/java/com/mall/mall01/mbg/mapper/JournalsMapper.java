package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.Journals;
import com.mall.mall01.mbg.model.JournalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JournalsMapper {
    int countByExample(JournalsExample example);

    int deleteByExample(JournalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Journals record);

    int insertSelective(Journals record);

    List<Journals> selectByExampleWithBLOBs(JournalsExample example);

    List<Journals> selectByExample(JournalsExample example);

    Journals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Journals record, @Param("example") JournalsExample example);

    int updateByExampleWithBLOBs(@Param("record") Journals record, @Param("example") JournalsExample example);

    int updateByExample(@Param("record") Journals record, @Param("example") JournalsExample example);

    int updateByPrimaryKeySelective(Journals record);

    int updateByPrimaryKeyWithBLOBs(Journals record);

    int updateByPrimaryKey(Journals record);
}