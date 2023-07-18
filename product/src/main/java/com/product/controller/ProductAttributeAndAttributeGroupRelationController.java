package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductAttributeAndAttributeGroupRelation;
import com.product.service.ProductAttributeAndAttributeGroupRelationService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 商品属性&属性分组关联 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@RestController
@RequestMapping("${moduleName}/productattributeandattributegrouprelation")
public class ProductAttributeAndAttributeGroupRelationController {
    @Resource
    private ProductAttributeAndAttributeGroupRelationService productAttributeAndAttributeGroupRelationService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(ProductAttributeAndAttributeGroupRelation productAttributeAndAttributeGroupRelation) {
        PageInfo page = productAttributeAndAttributeGroupRelationService.pageQuery(productAttributeAndAttributeGroupRelation);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        ProductAttributeAndAttributeGroupRelation productAttributeAndAttributeGroupRelation =productAttributeAndAttributeGroupRelationService.getById(id);
        return Result.success(productAttributeAndAttributeGroupRelation);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody ProductAttributeAndAttributeGroupRelationEntity productAttributeAndAttributeGroupRelation) {
            productAttributeAndAttributeGroupRelationService.save(productAttributeAndAttributeGroupRelation);
        return Result.success(productAttributeAndAttributeGroupRelation);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody ProductAttributeAndAttributeGroupRelation productAttributeAndAttributeGroupRelation) {
            productAttributeAndAttributeGroupRelationService.updateById(productAttributeAndAttributeGroupRelation);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            productAttributeAndAttributeGroupRelationService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
