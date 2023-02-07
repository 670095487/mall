package com.mall.mall01.controller;

import com.mall.mall01.service.UmsMemberService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2023/02/07
 */
@RestController
@RequestMapping("/Ums-member")
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequiredArgsConstructor
public class UmsMemberController {

    private final UmsMemberService umsMemberService;



}
