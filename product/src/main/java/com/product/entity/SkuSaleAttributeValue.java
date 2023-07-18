package com.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku销售属性&值 实体类
 *
 * @author jerry
 * @email ${email}
 * @date 2023-07-19 00:55:03
 */
@Data
@TableName("sku_sale_attribute_value")
public class SkuSaleAttributeValue implements Serializable {
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
	 * attr_id
	 */
	private Long attributeId;
	/**
	 * 销售属性名
	 */
	private String attributeName;
	/**
	 * 销售属性值
	 */
	private String attributeValue;
	/**
	 * 顺序
	 */
	private Long sort;

}
