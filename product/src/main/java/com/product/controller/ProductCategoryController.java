package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductCategory;
import com.product.service.ProductCategoryService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 商品三级分类 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/productcategory")
public class ProductCategoryController {
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(ProductCategory productCategory) {
        PageInfo page = productCategoryService.pageQuery(productCategory);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        ProductCategory productCategory =productCategoryService.getById(id);
        return Result.success(productCategory);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody ProductCategoryEntity productCategory) {
            productCategoryService.save(productCategory);
        return Result.success(productCategory);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody ProductCategory productCategory) {
            productCategoryService.updateById(productCategory);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            productCategoryService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
