package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.SkuInfoMapper;
import com.product.entity.SkuInfo;
import com.product.service.SkuInfoService;

/**
 * sku信息 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoMapper, SkuInfo> implements SkuInfoService {

    @Override
    public PageInfo pageQuery(SkuInfo skuInfo) {
        return new PageInfo();
    }

}
