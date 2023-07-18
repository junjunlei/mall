package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.ProductCategoryBrandRelationMapper;
import com.product.entity.ProductCategoryBrandRelation;
import com.product.service.ProductCategoryBrandRelationService;

/**
 * 品牌分类关联 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("productCategoryBrandRelationService")
public class ProductCategoryBrandRelationServiceImpl extends ServiceImpl<ProductCategoryBrandRelationMapper, ProductCategoryBrandRelation> implements ProductCategoryBrandRelationService {

    @Override
    public PageInfo pageQuery(ProductCategoryBrandRelation productCategoryBrandRelation) {
        return new PageInfo();
    }

}
