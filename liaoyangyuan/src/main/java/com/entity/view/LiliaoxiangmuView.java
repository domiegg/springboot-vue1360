package com.entity.view;

import com.entity.LiliaoxiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 理疗项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("liliaoxiangmu")
public class LiliaoxiangmuView extends LiliaoxiangmuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 项目类型的值
		*/
		private String liliaoxiangmuValue;



	public LiliaoxiangmuView() {

	}

	public LiliaoxiangmuView(LiliaoxiangmuEntity liliaoxiangmuEntity) {
		try {
			BeanUtils.copyProperties(this, liliaoxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 项目类型的值
			*/
			public String getLiliaoxiangmuValue() {
				return liliaoxiangmuValue;
			}
			/**
			* 设置： 项目类型的值
			*/
			public void setLiliaoxiangmuValue(String liliaoxiangmuValue) {
				this.liliaoxiangmuValue = liliaoxiangmuValue;
			}
















}
