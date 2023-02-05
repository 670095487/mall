package com.mall.mall01.controller;

import com.mall.mall01.common.CommonResult;
import com.mall.mall01.mbg.model.PmsBrand;
import com.mall.mall01.service.PmsBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @date 2023/02/05
 */
@RestController("/pms-brand")
@RequestMapping
@RequiredArgsConstructor
public class PmsBrandController {

    private final PmsBrandService pmsBrandService;

    @GetMapping
    public CommonResult<List<PmsBrand>> findAll(){
        return
    }

}
