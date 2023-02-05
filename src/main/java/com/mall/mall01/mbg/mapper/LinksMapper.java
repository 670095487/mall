package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.Links;
import com.mall.mall01.mbg.model.LinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinksMapper {
    int countByExample(LinksExample example);

    int deleteByExample(LinksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Links record);

    int insertSelective(Links record);

    List<Links> selectByExample(LinksExample example);

    Links selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Links record, @Param("example") LinksExample example);

    int updateByExample(@Param("record") Links record, @Param("example") LinksExample example);

    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}