package com.product.service.impl;
import org.springframework.stereotype.Service;

import com.unify.common.PageInfo;

import com.product.mapper.SpuCommentMapper;
import com.product.entity.SpuComment;
import com.product.service.SpuCommentService;

/**
 * 商品评价 服务类实现
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentMapper, SpuComment> implements SpuCommentService {

    @Override
    public PageInfo pageQuery(SpuComment spuComment) {
        return new PageInfo();
    }

}
