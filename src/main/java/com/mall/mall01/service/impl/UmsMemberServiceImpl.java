package com.mall.mall01.service.impl;

import com.mall.mall01.common.CommonResult;
import com.mall.mall01.service.RedisService;
import com.mall.mall01.service.UmsMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @date 2023/02/07
 */
@Service
@RequiredArgsConstructor
public class UmsMemberServiceImpl implements UmsMemberService {

    private final RedisService redisService;

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;

    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder verifyCode = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            verifyCode.append(random.nextInt(10));
        }
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, verifyCode.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return CommonResult.success(verifyCode.toString(), "send authCode successfully");
    }

    @Override
    public CommonResult verifyAuthCode(String telephone, String authCode) {
        String value = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        if (StringUtils.isEmpty(value)) {
            return CommonResult.failed("pls input auth code");
        }
        if (value.equals(authCode)) {
            return CommonResult.success("Auth successfully");
        } else {
            return CommonResult.failed("Auth failed, pls retrieve again!");
        }
    }
}
