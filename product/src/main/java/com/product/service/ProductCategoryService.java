package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.ProductCategory;

import java.util.Map;

/**
 * 商品三级分类 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(ProductCategory productCategory);
}

