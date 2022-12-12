package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu��Ϣ����
 * 
 * @author djq
 * @email 3078524100@qq.com
 * @date 2022-12-12 17:13:23
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ��Ʒid
	 */
	@TableId
	private Long spuId;
	/**
	 * ��Ʒ����
	 */
	private String decript;

}
