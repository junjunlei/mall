package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.SpuInfo;
import com.product.service.SpuInfoService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * spu信息 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/spuinfo")
public class SpuInfoController {
    @Resource
    private SpuInfoService spuInfoService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(SpuInfo spuInfo) {
        PageInfo page = spuInfoService.pageQuery(spuInfo);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        SpuInfo spuInfo =spuInfoService.getById(id);
        return Result.success(spuInfo);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody SpuInfoEntity spuInfo) {
            spuInfoService.save(spuInfo);
        return Result.success(spuInfo);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SpuInfo spuInfo) {
            spuInfoService.updateById(spuInfo);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            spuInfoService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
