package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.PostCategories;
import com.mall.mall01.mbg.model.PostCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostCategoriesMapper {
    int countByExample(PostCategoriesExample example);

    int deleteByExample(PostCategoriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostCategories record);

    int insertSelective(PostCategories record);

    List<PostCategories> selectByExample(PostCategoriesExample example);

    PostCategories selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostCategories record, @Param("example") PostCategoriesExample example);

    int updateByExample(@Param("record") PostCategories record, @Param("example") PostCategoriesExample example);

    int updateByPrimaryKeySelective(PostCategories record);

    int updateByPrimaryKey(PostCategories record);
}