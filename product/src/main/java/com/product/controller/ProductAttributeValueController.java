package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductAttributeValue;
import com.product.service.ProductAttributeValueService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * spu属性值 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/productattributevalue")
public class ProductAttributeValueController {
    @Resource
    private ProductAttributeValueService productAttributeValueService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(ProductAttributeValue productAttributeValue) {
        PageInfo page = productAttributeValueService.pageQuery(productAttributeValue);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        ProductAttributeValue productAttributeValue =productAttributeValueService.getById(id);
        return Result.success(productAttributeValue);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody ProductAttributeValueEntity productAttributeValue) {
            productAttributeValueService.save(productAttributeValue);
        return Result.success(productAttributeValue);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody ProductAttributeValue productAttributeValue) {
            productAttributeValueService.updateById(productAttributeValue);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            productAttributeValueService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
