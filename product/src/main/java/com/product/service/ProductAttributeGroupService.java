package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.ProductAttributeGroup;

import java.util.Map;

/**
 * 商品属性分组 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
public interface ProductAttributeGroupService extends IService<ProductAttributeGroup> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(ProductAttributeGroup productAttributeGroup);
}

