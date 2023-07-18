package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品属性&属性分组关联 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:04
 */
@Data
@TableName("product_attribute_and_attribute_group_relation")
public class ProductAttributeAndAttributeGroupRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 属性id
	 */
	private Long attributeId;
	/**
	 * 属性分组id
	 */
	private Long attributeGroupId;
	/**
	 * 属性组内排序
	 */
	private Long sort;

}
