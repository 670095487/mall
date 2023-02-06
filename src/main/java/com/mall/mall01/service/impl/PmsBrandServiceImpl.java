package com.mall.mall01.service.impl;

import com.github.pagehelper.PageHelper;
import com.mall.mall01.mbg.mapper.PmsBrandMapper;
import com.mall.mall01.mbg.model.PmsBrand;
import com.mall.mall01.mbg.model.PmsBrandExample;
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
        // 传入空对象表示无附加条件查询：select * from table;
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand createBrand(PmsBrand createItem) {
        pmsBrandMapper.insert(createItem);
        return createItem;
    }

    @Override
    public int updatedBrand(long id, PmsBrand pmsBrand) {
        pmsBrand.setId(id);
        return pmsBrandMapper.updateByPrimaryKey(pmsBrand);
    }

    /*
    总结：流程大致为：
      1、设置分页参数到ThreadLocal中
      2、调用查询，基于插件（拦截器）拦截query方法，从ThreadLocal中获取分页参数，针对不同的数据库类型使用不同的数据库分页方案
      3、根据结果包装返回PageInfo，这里注意的是调用了查询方法返回的List实际上是PageHelper的一个内部实现类Page，
         Page继承自ArrayList，保存了分页使用的参数
     */
    @Override
    public List<PmsBrand> findPmsBrandByPage(int pageNum, int pageSize) {
        // interceptor?
        PageHelper.startPage(pageNum, pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }
}
