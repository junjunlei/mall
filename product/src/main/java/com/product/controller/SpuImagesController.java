package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.SpuImages;
import com.product.service.SpuImagesService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * spu图片 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/spuimages")
public class SpuImagesController {
    @Resource
    private SpuImagesService spuImagesService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(SpuImages spuImages) {
        PageInfo page = spuImagesService.pageQuery(spuImages);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        SpuImages spuImages =spuImagesService.getById(id);
        return Result.success(spuImages);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody SpuImagesEntity spuImages) {
            spuImagesService.save(spuImages);
        return Result.success(spuImages);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SpuImages spuImages) {
            spuImagesService.updateById(spuImages);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            spuImagesService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
