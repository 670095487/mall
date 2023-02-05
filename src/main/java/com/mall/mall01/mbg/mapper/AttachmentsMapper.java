package com.mall.mall01.mbg.mapper;

import com.mall.mall01.mbg.model.Attachments;
import com.mall.mall01.mbg.model.AttachmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttachmentsMapper {
    int countByExample(AttachmentsExample example);

    int deleteByExample(AttachmentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attachments record);

    int insertSelective(Attachments record);

    List<Attachments> selectByExample(AttachmentsExample example);

    Attachments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attachments record, @Param("example") AttachmentsExample example);

    int updateByExample(@Param("record") Attachments record, @Param("example") AttachmentsExample example);

    int updateByPrimaryKeySelective(Attachments record);

    int updateByPrimaryKey(Attachments record);
}