package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu属性值 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Data
@TableName("product_attribute_value")
public class ProductAttributeValue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long spuId;
	/**
	 * 属性id
	 */
	private Long attributeId;
	/**
	 * 属性名
	 */
	private String attributeName;
	/**
	 * 属性值
	 */
	private String attributeValue;
	/**
	 * 顺序
	 */
	private Long sort;
	/**
	 * 快速展示【是否展示在介绍上；0-否 1-是】
	 */
	private Integer quickShow;

}
