package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.ProductAttributeAndAttributeGroupRelation;

import java.util.Map;

/**
 * 商品属性&属性分组关联 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
public interface ProductAttributeAndAttributeGroupRelationService extends IService<ProductAttributeAndAttributeGroupRelation> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(ProductAttributeAndAttributeGroupRelation productAttributeAndAttributeGroupRelation);
}

