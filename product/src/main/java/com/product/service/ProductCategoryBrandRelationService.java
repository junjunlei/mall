package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.ProductCategoryBrandRelation;

import java.util.Map;

/**
 * 品牌分类关联 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
public interface ProductCategoryBrandRelationService extends IService<ProductCategoryBrandRelation> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(ProductCategoryBrandRelation productCategoryBrandRelation);
}

