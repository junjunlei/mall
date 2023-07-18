package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.SkuSaleAttributeValue;
import com.product.service.SkuSaleAttributeValueService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * sku销售属性&值 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/skusaleattributevalue")
public class SkuSaleAttributeValueController {
    @Resource
    private SkuSaleAttributeValueService skuSaleAttributeValueService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(SkuSaleAttributeValue skuSaleAttributeValue) {
        PageInfo page = skuSaleAttributeValueService.pageQuery(skuSaleAttributeValue);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        SkuSaleAttributeValue skuSaleAttributeValue =skuSaleAttributeValueService.getById(id);
        return Result.success(skuSaleAttributeValue);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody SkuSaleAttributeValueEntity skuSaleAttributeValue) {
            skuSaleAttributeValueService.save(skuSaleAttributeValue);
        return Result.success(skuSaleAttributeValue);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SkuSaleAttributeValue skuSaleAttributeValue) {
            skuSaleAttributeValueService.updateById(skuSaleAttributeValue);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            skuSaleAttributeValueService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
