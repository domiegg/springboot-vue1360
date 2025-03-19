package com.entity.view;

import com.entity.YishengqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 医生请假
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yishengqingjia")
public class YishengqingjiaView extends YishengqingjiaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 请假类型的值
		*/
		private String qingjiaValue;
		/**
		* 审核结果的值
		*/
		private String yishengqingjiaYesnoValue;



		//级联表 yisheng
			/**
			* 医生工号
			*/
			private String yishengUuidNumber;
			/**
			* 医生姓名
			*/
			private String yishengName;
			/**
			* 手机号
			*/
			private String yishengPhone;
			/**
			* 头像
			*/
			private String yishengPhoto;

	public YishengqingjiaView() {

	}

	public YishengqingjiaView(YishengqingjiaEntity yishengqingjiaEntity) {
		try {
			BeanUtils.copyProperties(this, yishengqingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 请假类型的值
			*/
			public String getQingjiaValue() {
				return qingjiaValue;
			}
			/**
			* 设置： 请假类型的值
			*/
			public void setQingjiaValue(String qingjiaValue) {
				this.qingjiaValue = qingjiaValue;
			}
			/**
			* 获取： 审核结果的值
			*/
			public String getYishengqingjiaYesnoValue() {
				return yishengqingjiaYesnoValue;
			}
			/**
			* 设置： 审核结果的值
			*/
			public void setYishengqingjiaYesnoValue(String yishengqingjiaYesnoValue) {
				this.yishengqingjiaYesnoValue = yishengqingjiaYesnoValue;
			}






















				//级联表的get和set yisheng

					/**
					* 获取： 医生工号
					*/
					public String getYishengUuidNumber() {
						return yishengUuidNumber;
					}
					/**
					* 设置： 医生工号
					*/
					public void setYishengUuidNumber(String yishengUuidNumber) {
						this.yishengUuidNumber = yishengUuidNumber;
					}

					/**
					* 获取： 医生姓名
					*/
					public String getYishengName() {
						return yishengName;
					}
					/**
					* 设置： 医生姓名
					*/
					public void setYishengName(String yishengName) {
						this.yishengName = yishengName;
					}

					/**
					* 获取： 手机号
					*/
					public String getYishengPhone() {
						return yishengPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYishengPhone(String yishengPhone) {
						this.yishengPhone = yishengPhone;
					}

					/**
					* 获取： 头像
					*/
					public String getYishengPhoto() {
						return yishengPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYishengPhoto(String yishengPhoto) {
						this.yishengPhoto = yishengPhoto;
					}








}
