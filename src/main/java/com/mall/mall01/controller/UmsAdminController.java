package com.mall.mall01.controller;

import com.mall.mall01.common.CommonResult;
import com.mall.mall01.dto.UmsAdminLoginParam;
import com.mall.mall01.mbg.model.UmsAdmin;
import com.mall.mall01.mbg.model.UmsPermission;
import com.mall.mall01.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yunN
 * @date 2023/02/09.
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequiredArgsConstructor
public class UmsAdminController {

    private final UmsAdminService adminService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @PostMapping("/register")
    @ApiOperation(value = "用户注册")
    public CommonResult<UmsAdmin> registry(@RequestBody UmsAdmin umsAdminParam, BindingResult result){
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (umsAdmin == null) {
            return CommonResult.failed();
        }
        return CommonResult.success(umsAdmin);
    }

    @PostMapping("/login")
    @ApiOperation(value = "登录以后返回token")
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, BindingResult result) {
        String token = adminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @PostMapping(value = "/permission/{adminId}")
    public CommonResult<List<UmsPermission>> getPermissionList(@PathVariable Long adminId) {
        List<UmsPermission> permissionList = adminService.getPermissionList(adminId);
        return CommonResult.success(permissionList);
    }
}
