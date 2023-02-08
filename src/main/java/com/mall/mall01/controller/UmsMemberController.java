package com.mall.mall01.controller;

import com.mall.mall01.common.CommonResult;
import com.mall.mall01.service.UmsMemberService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @date 2023/02/07
 */
@RestController
@RequestMapping("/Ums-member")
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequiredArgsConstructor
public class UmsMemberController {

    private final UmsMemberService umsMemberService;

    // 获取验证码
    @GetMapping
    public CommonResult getAuthCode(@RequestParam String telNo) {
        return umsMemberService.generateAuthCode(telNo);
    }

    // 判断验证码是否正确
    @PostMapping
    public CommonResult verifyAuthCode(@RequestParam String telNo,
                                       @RequestParam String authCode) {
        return umsMemberService.verifyAuthCode(telNo, authCode);
    }

}
