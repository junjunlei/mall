package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku图片 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Data
@TableName("sku_images")
public class SkuImages implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 图片地址
	 */
	private String imgUrl;
	/**
	 * 排序
	 */
	private Long sort;
	/**
	 * 默认图[0 - 不是默认图，1 - 是默认图]
	 */
	private Long defaultImg;

}
