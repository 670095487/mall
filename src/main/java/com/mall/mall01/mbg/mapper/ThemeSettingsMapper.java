package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.ThemeSettings;
import com.mall.mall01.mbg.model.ThemeSettingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeSettingsMapper {
    int countByExample(ThemeSettingsExample example);

    int deleteByExample(ThemeSettingsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThemeSettings record);

    int insertSelective(ThemeSettings record);

    List<ThemeSettings> selectByExampleWithBLOBs(ThemeSettingsExample example);

    List<ThemeSettings> selectByExample(ThemeSettingsExample example);

    ThemeSettings selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThemeSettings record, @Param("example") ThemeSettingsExample example);

    int updateByExampleWithBLOBs(@Param("record") ThemeSettings record, @Param("example") ThemeSettingsExample example);

    int updateByExample(@Param("record") ThemeSettings record, @Param("example") ThemeSettingsExample example);

    int updateByPrimaryKeySelective(ThemeSettings record);

    int updateByPrimaryKeyWithBLOBs(ThemeSettings record);

    int updateByPrimaryKey(ThemeSettings record);
}