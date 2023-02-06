package com.mall.mall01.service.impl;

import com.mall.mall01.mbg.mapper.PmsBrandMapper;
import com.mall.mall01.mbg.model.PmsBrand;
import com.mall.mall01.service.PmsBrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2023/02/05
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class PmsBrandServiceImpl implements PmsBrandService {

    private final PmsBrandMapper pmsBrandMapper;


    @Override
    public List<PmsBrand> findAllPmsBrands() {
        return pmsBrandMapper;
    }
}
