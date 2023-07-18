package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.SpuInfoDesc;
import com.product.service.SpuInfoDescService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * spu信息介绍 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/spuinfodesc")
public class SpuInfoDescController {
    @Resource
    private SpuInfoDescService spuInfoDescService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(SpuInfoDesc spuInfoDesc) {
        PageInfo page = spuInfoDescService.pageQuery(spuInfoDesc);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{spuId}")
    public Result<?> detail(@PathVariable Long spuId) {
        SpuInfoDesc spuInfoDesc =spuInfoDescService.getById(spuId);
        return Result.success(spuInfoDesc);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody SpuInfoDescEntity spuInfoDesc) {
            spuInfoDescService.save(spuInfoDesc);
        return Result.success(spuInfoDesc);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SpuInfoDesc spuInfoDesc) {
            spuInfoDescService.updateById(spuInfoDesc);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{spuId}")
    public R delete(@PathVariable Long spuId) {
            spuInfoDescService.removeByIds(Arrays.asList(spuId));
        return Result.success();
    }

}
