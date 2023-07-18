package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.SpuInfoMapper;
import com.product.entity.SpuInfo;
import com.product.service.SpuInfoService;

/**
 * spu信息 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoMapper, SpuInfo> implements SpuInfoService {

    @Override
    public PageInfo pageQuery(SpuInfo spuInfo) {
        return new PageInfo();
    }

}
