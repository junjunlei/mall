package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.ProductCategoryMapper;
import com.product.entity.ProductCategory;
import com.product.service.ProductCategoryService;

/**
 * 商品三级分类 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("productCategoryService")
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Override
    public PageInfo pageQuery(ProductCategory productCategory) {
        return new PageInfo();
    }

}
