package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductCategoryBrandRelation;
import com.product.service.ProductCategoryBrandRelationService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 品牌分类关联 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/productcategorybrandrelation")
public class ProductCategoryBrandRelationController {
    @Resource
    private ProductCategoryBrandRelationService productCategoryBrandRelationService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(ProductCategoryBrandRelation productCategoryBrandRelation) {
        PageInfo page = productCategoryBrandRelationService.pageQuery(productCategoryBrandRelation);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        ProductCategoryBrandRelation productCategoryBrandRelation =productCategoryBrandRelationService.getById(id);
        return Result.success(productCategoryBrandRelation);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody ProductCategoryBrandRelationEntity productCategoryBrandRelation) {
            productCategoryBrandRelationService.save(productCategoryBrandRelation);
        return Result.success(productCategoryBrandRelation);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody ProductCategoryBrandRelation productCategoryBrandRelation) {
            productCategoryBrandRelationService.updateById(productCategoryBrandRelation);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            productCategoryBrandRelationService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
