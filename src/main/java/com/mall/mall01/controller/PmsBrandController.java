package com.mall.mall01.controller;

import com.mall.mall01.common.CommonPage;
import com.mall.mall01.common.CommonResult;
import com.mall.mall01.mbg.model.PmsBrand;
import com.mall.mall01.service.PmsBrandService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<List<PmsBrand>> findAll() {
        return CommonResult.success(pmsBrandService.findAllPmsBrands());
    }

    @PostMapping
    public CommonResult<PmsBrand> createBrand(@RequestBody @Validated PmsBrand createItem) {
        return CommonResult.success(pmsBrandService.createBrand(createItem));
    }

    /**
     * return updated brand
     */
    @PutMapping
    public CommonResult<PmsBrand> updatedBrand(@PathVariable long id, @RequestBody PmsBrand pmsBrand) {
        CommonResult<PmsBrand> commonResult;
        int count = pmsBrandService.updatedBrand(id, pmsBrand);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrand);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @GetMapping("/page")
    public CommonResult<CommonPage<PmsBrand>> findByPages(
            @RequestParam(value = "pageNum", defaultValue = "1")
            @ApiParam(name = "页码") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "2")
            @ApiParam(name = "页长") Integer pageSize) {
        List<PmsBrand> brandList = pmsBrandService.findPmsBrandByPage(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));

    }
}
