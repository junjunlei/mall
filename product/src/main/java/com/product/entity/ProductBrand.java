package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@Data
@TableName("product_brand")
public class ProductBrand implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Long id;
	/**
	 * 品牌名称
	 */
	private String brandName;
	/**
	 * 品牌logo地址
	 */
	private String logoUrl;
	/**
	 * 介绍
	 */
	private String desc;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	private String firstLetter;
	/**
	 * 排序
	 */
	private Long sort;

}
