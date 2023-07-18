package com.product.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.CommentReplay;
import com.product.service.CommentReplayService;
import com.unify.common.PageInfo;
import com.unify.common.Result;


/**
 * 商品评价回复关系 API
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@RestController
@RequestMapping("${moduleName}/commentreplay")
public class CommentReplayController {
    @Resource
    private CommentReplayService commentReplayService;

    /**
     * 分页查询列表
     */
    @RequestMapping("/pageQuery")
    public Result<?> list(CommentReplay commentReplay) {
        PageInfo page = commentReplayService.pageQuery(commentReplay);
        return Result.success(page);
    }


    /**
     * 明细信息
     */
    @RequestMapping("/detail/{id}")
    public Result<?> detail(@PathVariable Long id) {
        CommentReplay commentReplay =commentReplayService.getById(id);
        return Result.success(commentReplay);
    }

    /**
     * 新建
     */
    @PostMapping("/create")
    public Result<?> create(@RequestBody CommentReplayEntity commentReplay) {
            commentReplayService.save(commentReplay);
        return Result.success(commentReplay);
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public Result<?> update(@RequestBody CommentReplay commentReplay) {
            commentReplayService.updateById(commentReplay);
        return Result.success();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
            commentReplayService.removeByIds(Arrays.asList(id));
        return Result.success();
    }

}
