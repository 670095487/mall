package com.mall.mall01.service;

import com.mall.mall01.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @author yunN
 * @date 2023/02/13.
 */
public interface MemberReadHistoryService {

    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
