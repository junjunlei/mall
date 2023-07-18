package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductBrand;
import com.product.service.ProductBrandService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 品牌 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@RestController
@RequestMapping("${moduleName}/productbrand")
public class ProductBrandController {
    @Resource
    private ProductBrandService productBrandService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(ProductBrand productBrand) {
        PageInfo page = productBrandService.pageQuery(productBrand);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        ProductBrand productBrand =productBrandService.getById(id);
        return Result.success(productBrand);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody ProductBrandEntity productBrand) {
            productBrandService.save(productBrand);
        return Result.success(productBrand);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody ProductBrand productBrand) {
            productBrandService.updateById(productBrand);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            productBrandService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
