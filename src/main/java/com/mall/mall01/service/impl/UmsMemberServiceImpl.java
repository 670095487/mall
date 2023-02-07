package com.mall.mall01.service.impl;

import com.mall.mall01.common.CommonResult;
import com.mall.mall01.service.UmsMemberService;
import org.springframework.stereotype.Service;

/**
 * @date 2023/02/07
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {


    @Override
    public CommonResult generateAuthCode(String telephone) {
        return null;
    }

    @Override
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        return null;
    }
}
