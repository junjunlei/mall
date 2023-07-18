package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu图片 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Data
@TableName("spu_images")
public class SpuImages implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * 图片名
	 */
	private String imgName;
	/**
	 * 图片地址
	 */
	private String imgUrl;
	/**
	 * 顺序
	 */
	private Long imgSort;
	/**
	 * 是否默认图
	 */
	private Integer defaultImg;

}
