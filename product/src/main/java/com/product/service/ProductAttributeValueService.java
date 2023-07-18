package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.ProductAttributeValue;

import java.util.Map;

/**
 * spu属性值 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
public interface ProductAttributeValueService extends IService<ProductAttributeValue> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(ProductAttributeValue productAttributeValue);
}

