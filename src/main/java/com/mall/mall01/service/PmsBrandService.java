package com.mall.mall01.service;

import com.mall.mall01.mbg.model.PmsBrand;

import java.util.List;

/**
 * @date 2023/02/05
 */
public interface PmsBrandService {

    List<PmsBrand> findAllPmsBrands();

    PmsBrand createBrand(PmsBrand createItem);

    int updatedBrand(long id, PmsBrand pmsBrand);

    List<PmsBrand> findPmsBrandByPage(int pageNum, int pageSize);
}
