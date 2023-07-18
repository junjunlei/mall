package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductAttribute;
import com.product.service.ProductAttributeService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 商品属性 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@RestController
@RequestMapping("${moduleName}/productattribute")
public class ProductAttributeController {
    @Resource
    private ProductAttributeService productAttributeService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(ProductAttribute productAttribute) {
        PageInfo page = productAttributeService.pageQuery(productAttribute);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        ProductAttribute productAttribute =productAttributeService.getById(id);
        return Result.success(productAttribute);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody ProductAttributeEntity productAttribute) {
            productAttributeService.save(productAttribute);
        return Result.success(productAttribute);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody ProductAttribute productAttribute) {
            productAttributeService.updateById(productAttribute);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            productAttributeService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
