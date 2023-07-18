package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.ProductAttributeAndAttributeGroupRelationMapper;
import com.product.entity.ProductAttributeAndAttributeGroupRelation;
import com.product.service.ProductAttributeAndAttributeGroupRelationService;

/**
 * 商品属性&属性分组关联 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@Service("productAttributeAndAttributeGroupRelationService")
public class ProductAttributeAndAttributeGroupRelationServiceImpl extends ServiceImpl<ProductAttributeAndAttributeGroupRelationMapper, ProductAttributeAndAttributeGroupRelation> implements ProductAttributeAndAttributeGroupRelationService {

    @Override
    public PageInfo pageQuery(ProductAttributeAndAttributeGroupRelation productAttributeAndAttributeGroupRelation) {
        return new PageInfo();
    }

}
