package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品属性分组 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@Data
@TableName("product_attribute_group")
public class ProductAttributeGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分组id
	 */
	@TableId
	private Long id;
	/**
	 * 组名
	 */
	private String attributeGroupName;
	/**
	 * 排序
	 */
	private Long sort;
	/**
	 * 描述
	 */
	private String desc;
	/**
	 * 组图标
	 */
	private String icon;
	/**
	 * 所属分类id
	 */
	private Long categoryId;

}
