package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.SpuImagesMapper;
import com.product.entity.SpuImages;
import com.product.service.SpuImagesService;

/**
 * spu图片 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesMapper, SpuImages> implements SpuImagesService {

    @Override
    public PageInfo pageQuery(SpuImages spuImages) {
        return new PageInfo();
    }

}
