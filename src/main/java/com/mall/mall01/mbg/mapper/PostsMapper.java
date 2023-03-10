package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.Posts;
import com.mall.mall01.mbg.model.PostsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostsMapper {
    int countByExample(PostsExample example);

    int deleteByExample(PostsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Posts record);

    int insertSelective(Posts record);

    List<Posts> selectByExampleWithBLOBs(PostsExample example);

    List<Posts> selectByExample(PostsExample example);

    Posts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByExampleWithBLOBs(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByExample(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKeyWithBLOBs(Posts record);

    int updateByPrimaryKey(Posts record);
}