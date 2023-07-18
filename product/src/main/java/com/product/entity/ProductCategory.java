package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品三级分类 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Data
@TableName("product_category")
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类id
	 */
	@TableId
	private Long id;
	/**
	 * 分类名称
	 */
	private String categoryName;
	/**
	 * 父分类id
	 */
	private Long parentId;
	/**
	 * 层级
	 */
	private Long level;
	/**
	 * 是否显示[0-不显示，1显示]
	 */
	private Integer showStatus;
	/**
	 * 排序
	 */
	private Long sort;
	/**
	 * 图标地址
	 */
	private String icon;
	/**
	 * 计量单位
	 */
	private String unit;
	/**
	 * 商品数量
	 */
	private Long number;

}
