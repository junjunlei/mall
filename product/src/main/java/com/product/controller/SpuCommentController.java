package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.SpuComment;
import com.product.service.SpuCommentService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 商品评价 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/spucomment")
public class SpuCommentController {
    @Resource
    private SpuCommentService spuCommentService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(SpuComment spuComment) {
        PageInfo page = spuCommentService.pageQuery(spuComment);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        SpuComment spuComment =spuCommentService.getById(id);
        return Result.success(spuComment);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody SpuCommentEntity spuComment) {
            spuCommentService.save(spuComment);
        return Result.success(spuComment);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody SpuComment spuComment) {
            spuCommentService.updateById(spuComment);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            spuCommentService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
