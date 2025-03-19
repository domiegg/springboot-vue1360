package com.entity.view;

import com.entity.ChaungweishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 床位申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chaungweishenqing")
public class ChaungweishenqingView extends ChaungweishenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 申请状态的值
		*/
		private String chaungweishenqingYesnoValue;



		//级联表 chuangwei
			/**
			* 床位编号
			*/
			private String chuangweiName;
			/**
			* 房间地址
			*/
			private String chuangweiAddress;
			/**
			* 床位状态
			*/
			private Integer chuangweiTypes;
				/**
				* 床位状态的值
				*/
				private String chuangweiValue;

		//级联表 yonghu
			/**
			* 患者姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 患者 的 医生
			*/
			private Integer yonghuYishengId;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ChaungweishenqingView() {

	}

	public ChaungweishenqingView(ChaungweishenqingEntity chaungweishenqingEntity) {
		try {
			BeanUtils.copyProperties(this, chaungweishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申请状态的值
			*/
			public String getChaungweishenqingYesnoValue() {
				return chaungweishenqingYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setChaungweishenqingYesnoValue(String chaungweishenqingYesnoValue) {
				this.chaungweishenqingYesnoValue = chaungweishenqingYesnoValue;
			}







				//级联表的get和set chuangwei

					/**
					* 获取： 床位编号
					*/
					public String getChuangweiName() {
						return chuangweiName;
					}
					/**
					* 设置： 床位编号
					*/
					public void setChuangweiName(String chuangweiName) {
						this.chuangweiName = chuangweiName;
					}

					/**
					* 获取： 房间地址
					*/
					public String getChuangweiAddress() {
						return chuangweiAddress;
					}
					/**
					* 设置： 房间地址
					*/
					public void setChuangweiAddress(String chuangweiAddress) {
						this.chuangweiAddress = chuangweiAddress;
					}

					/**
					* 获取： 床位状态
					*/
					public Integer getChuangweiTypes() {
						return chuangweiTypes;
					}
					/**
					* 设置： 床位状态
					*/
					public void setChuangweiTypes(Integer chuangweiTypes) {
						this.chuangweiTypes = chuangweiTypes;
					}


						/**
						* 获取： 床位状态的值
						*/
						public String getChuangweiValue() {
							return chuangweiValue;
						}
						/**
						* 设置： 床位状态的值
						*/
						public void setChuangweiValue(String chuangweiValue) {
							this.chuangweiValue = chuangweiValue;
						}


































				//级联表的get和set yonghu

					/**
					* 获取： 患者姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 患者姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取：患者 的 医生
					*/
					public Integer getYonghuYishengId() {
						return yonghuYishengId;
					}
					/**
					* 设置：患者 的 医生
					*/
					public void setYonghuYishengId(Integer yonghuYishengId) {
						this.yonghuYishengId = yonghuYishengId;
					}


					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
