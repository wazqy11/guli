package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu����ֵ
 * 
 * @author djq
 * @email 3078524100@qq.com
 * @date 2022-12-12 17:13:24
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ��Ʒid
	 */
	private Long spuId;
	/**
	 * ����id
	 */
	private Long attrId;
	/**
	 * ������
	 */
	private String attrName;
	/**
	 * ����ֵ
	 */
	private String attrValue;
	/**
	 * ˳��
	 */
	private Integer attrSort;
	/**
	 * ����չʾ���Ƿ�չʾ�ڽ����ϣ�0-�� 1-�ǡ�
	 */
	private Integer quickShow;

}
