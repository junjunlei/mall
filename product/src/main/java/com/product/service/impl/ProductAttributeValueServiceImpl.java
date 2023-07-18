package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.ProductAttributeValueMapper;
import com.product.entity.ProductAttributeValue;
import com.product.service.ProductAttributeValueService;

/**
 * spu属性值 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("productAttributeValueService")
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

    @Override
    public PageInfo pageQuery(ProductAttributeValue productAttributeValue) {
        return new PageInfo();
    }

}
