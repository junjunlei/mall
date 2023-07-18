package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.SpuInfo;

import java.util.Map;

/**
 * spu信息 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
public interface SpuInfoService extends IService<SpuInfo> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(SpuInfo spuInfo);
}

