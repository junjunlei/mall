package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.ProductAttributeMapper;
import com.product.entity.ProductAttribute;
import com.product.service.ProductAttributeService;

/**
 * 商品属性 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@Service("productAttributeService")
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute> implements ProductAttributeService {

    @Override
    public PageInfo pageQuery(ProductAttribute productAttribute) {
        return new PageInfo();
    }

}
