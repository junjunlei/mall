package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.SpuInfoDescMapper;
import com.product.entity.SpuInfoDesc;
import com.product.service.SpuInfoDescService;

/**
 * spu信息介绍 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescMapper, SpuInfoDesc> implements SpuInfoDescService {

    @Override
    public PageInfo pageQuery(SpuInfoDesc spuInfoDesc) {
        return new PageInfo();
    }

}
