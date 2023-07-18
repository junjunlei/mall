package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.SkuImages;
import com.product.service.SkuImagesService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * sku图片 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/skuimages")
public class SkuImagesController {
    @Resource
    private SkuImagesService skuImagesService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(SkuImages skuImages) {
        PageInfo page = skuImagesService.pageQuery(skuImages);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        SkuImages skuImages =skuImagesService.getById(id);
        return Result.success(skuImages);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody SkuImagesEntity skuImages) {
            skuImagesService.save(skuImages);
        return Result.success(skuImages);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SkuImages skuImages) {
            skuImagesService.updateById(skuImages);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            skuImagesService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
