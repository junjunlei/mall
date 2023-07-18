package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.ProductBrandMapper;
import com.product.entity.ProductBrand;
import com.product.service.ProductBrandService;

/**
 * 品牌 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@Service("productBrandService")
public class ProductBrandServiceImpl extends ServiceImpl<ProductBrandMapper, ProductBrand> implements ProductBrandService {

    @Override
    public PageInfo pageQuery(ProductBrand productBrand) {
        return new PageInfo();
    }

}
