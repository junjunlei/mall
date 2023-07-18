package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductAttributeGroup;
import com.product.service.ProductAttributeGroupService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 商品属性分组 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@RestController
@RequestMapping("${moduleName}/productattributegroup")
public class ProductAttributeGroupController {
    @Resource
    private ProductAttributeGroupService productAttributeGroupService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(ProductAttributeGroup productAttributeGroup) {
        PageInfo page = productAttributeGroupService.pageQuery(productAttributeGroup);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        ProductAttributeGroup productAttributeGroup =productAttributeGroupService.getById(id);
        return Result.success(productAttributeGroup);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody ProductAttributeGroupEntity productAttributeGroup) {
            productAttributeGroupService.save(productAttributeGroup);
        return Result.success(productAttributeGroup);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody ProductAttributeGroup productAttributeGroup) {
            productAttributeGroupService.updateById(productAttributeGroup);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            productAttributeGroupService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
