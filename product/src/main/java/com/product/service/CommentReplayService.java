package com.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.unify.common.PageInfo;
import com.product.entity.CommentReplay;

import java.util.Map;

/**
 * 商品评价回复关系 服务类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
public interface CommentReplayService extends IService<CommentReplay> {

    /**
    * 分页查询列表信息
    * @return
    */
    PageInfo pageQuery(CommentReplay commentReplay);
}

