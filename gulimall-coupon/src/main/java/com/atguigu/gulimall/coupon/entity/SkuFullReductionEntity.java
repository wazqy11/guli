package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ��Ʒ������Ϣ
 * 
 * @author djq
 * @email 3078524100@qq.com
 * @date 2022-12-12 19:14:13
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * ������
	 */
	private BigDecimal fullPrice;
	/**
	 * ������
	 */
	private BigDecimal reducePrice;
	/**
	 * �Ƿ���������Ż�
	 */
	private Integer addOther;

}
