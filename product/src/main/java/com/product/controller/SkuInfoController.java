package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.SkuInfo;
import com.product.service.SkuInfoService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * sku信息 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/skuinfo")
public class SkuInfoController {
    @Resource
    private SkuInfoService skuInfoService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(SkuInfo skuInfo) {
        PageInfo page = skuInfoService.pageQuery(skuInfo);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        SkuInfo skuInfo =skuInfoService.getById(id);
        return Result.success(skuInfo);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody SkuInfoEntity skuInfo) {
            skuInfoService.save(skuInfo);
        return Result.success(skuInfo);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SkuInfo skuInfo) {
            skuInfoService.updateById(skuInfo);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            skuInfoService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
