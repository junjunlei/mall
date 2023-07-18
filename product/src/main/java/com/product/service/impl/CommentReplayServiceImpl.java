package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.CommentReplayMapper;
import com.product.entity.CommentReplay;
import com.product.service.CommentReplayService;

/**
 * 商品评价回复关系 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplay> implements CommentReplayService {

    @Override
    public PageInfo pageQuery(CommentReplay commentReplay) {
        return new PageInfo();
    }

}
