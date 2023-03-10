package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.CommentBlackList;
import com.mall.mall01.mbg.model.CommentBlackListExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentBlackListMapper {
    int countByExample(CommentBlackListExample example);

    int deleteByExample(CommentBlackListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentBlackList record);

    int insertSelective(CommentBlackList record);

    List<CommentBlackList> selectByExample(CommentBlackListExample example);

    CommentBlackList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentBlackList record, @Param("example") CommentBlackListExample example);

    int updateByExample(@Param("record") CommentBlackList record, @Param("example") CommentBlackListExample example);

    int updateByPrimaryKeySelective(CommentBlackList record);

    int updateByPrimaryKey(CommentBlackList record);
}