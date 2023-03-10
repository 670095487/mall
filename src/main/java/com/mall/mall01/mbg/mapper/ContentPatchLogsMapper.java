package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.ContentPatchLogs;
import com.mall.mall01.mbg.model.ContentPatchLogsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentPatchLogsMapper {
    int countByExample(ContentPatchLogsExample example);

    int deleteByExample(ContentPatchLogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentPatchLogs record);

    int insertSelective(ContentPatchLogs record);

    List<ContentPatchLogs> selectByExampleWithBLOBs(ContentPatchLogsExample example);

    List<ContentPatchLogs> selectByExample(ContentPatchLogsExample example);

    ContentPatchLogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentPatchLogs record, @Param("example") ContentPatchLogsExample example);

    int updateByExampleWithBLOBs(@Param("record") ContentPatchLogs record, @Param("example") ContentPatchLogsExample example);

    int updateByExample(@Param("record") ContentPatchLogs record, @Param("example") ContentPatchLogsExample example);

    int updateByPrimaryKeySelective(ContentPatchLogs record);

    int updateByPrimaryKeyWithBLOBs(ContentPatchLogs record);

    int updateByPrimaryKey(ContentPatchLogs record);
}