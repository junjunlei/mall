package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.ProductBrand;

import java.util.Map;

/**
 * 品牌 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
public interface ProductBrandService extends IService<ProductBrand> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(ProductBrand productBrand);
}

