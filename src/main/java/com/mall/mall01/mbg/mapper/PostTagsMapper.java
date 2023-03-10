package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.PostTags;
import com.mall.mall01.mbg.model.PostTagsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostTagsMapper {
    int countByExample(PostTagsExample example);

    int deleteByExample(PostTagsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostTags record);

    int insertSelective(PostTags record);

    List<PostTags> selectByExample(PostTagsExample example);

    PostTags selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostTags record, @Param("example") PostTagsExample example);

    int updateByExample(@Param("record") PostTags record, @Param("example") PostTagsExample example);

    int updateByPrimaryKeySelective(PostTags record);

    int updateByPrimaryKey(PostTags record);
}