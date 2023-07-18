package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.SkuImagesMapper;
import com.product.entity.SkuImages;
import com.product.service.SkuImagesService;

/**
 * sku图片 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesMapper, SkuImages> implements SkuImagesService {

    @Override
    public PageInfo pageQuery(SkuImages skuImages) {
        return new PageInfo();
    }

}
