package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.SkuSaleAttributeValueMapper;
import com.product.entity.SkuSaleAttributeValue;
import com.product.service.SkuSaleAttributeValueService;

/**
 * sku销售属性&值 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("skuSaleAttributeValueService")
public class SkuSaleAttributeValueServiceImpl extends ServiceImpl<SkuSaleAttributeValueMapper, SkuSaleAttributeValue> implements SkuSaleAttributeValueService {

    @Override
    public PageInfo pageQuery(SkuSaleAttributeValue skuSaleAttributeValue) {
        return new PageInfo();
    }

}
