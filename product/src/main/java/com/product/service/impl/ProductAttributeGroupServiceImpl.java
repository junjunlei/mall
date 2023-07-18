package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.ProductAttributeGroupMapper;
import com.product.entity.ProductAttributeGroup;
import com.product.service.ProductAttributeGroupService;

/**
 * 商品属性分组 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@Service("productAttributeGroupService")
public class ProductAttributeGroupServiceImpl extends ServiceImpl<ProductAttributeGroupMapper, ProductAttributeGroup> implements ProductAttributeGroupService {

    @Override
    public PageInfo pageQuery(ProductAttributeGroup productAttributeGroup) {
        return new PageInfo();
    }

}
