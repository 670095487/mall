package com.mall.mall01.service;

import com.mall.mall01.common.CommonResult;

/**
 * @date 2023/02/07
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
