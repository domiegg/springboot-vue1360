package com.entity.view;

import com.entity.XiangmushenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 项目申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiangmushenqing")
public class XiangmushenqingView extends XiangmushenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 申请状态的值
		*/
		private String xiangmushenqingYesnoValue;



		//级联表 liliaoxiangmu
			/**
			* 项目名称
			*/
			private String liliaoxiangmuName;
			/**
			* 项目类型
			*/
			private Integer liliaoxiangmuTypes;
				/**
				* 项目类型的值
				*/
				private String liliaoxiangmuValue;
			/**
			* 项目介绍
			*/
			private String liliaoxiangmuContent;

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

	public XiangmushenqingView() {

	}

	public XiangmushenqingView(XiangmushenqingEntity xiangmushenqingEntity) {
		try {
			BeanUtils.copyProperties(this, xiangmushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申请状态的值
			*/
			public String getXiangmushenqingYesnoValue() {
				return xiangmushenqingYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setXiangmushenqingYesnoValue(String xiangmushenqingYesnoValue) {
				this.xiangmushenqingYesnoValue = xiangmushenqingYesnoValue;
			}
















				//级联表的get和set liliaoxiangmu

					/**
					* 获取： 项目名称
					*/
					public String getLiliaoxiangmuName() {
						return liliaoxiangmuName;
					}
					/**
					* 设置： 项目名称
					*/
					public void setLiliaoxiangmuName(String liliaoxiangmuName) {
						this.liliaoxiangmuName = liliaoxiangmuName;
					}

					/**
					* 获取： 项目类型
					*/
					public Integer getLiliaoxiangmuTypes() {
						return liliaoxiangmuTypes;
					}
					/**
					* 设置： 项目类型
					*/
					public void setLiliaoxiangmuTypes(Integer liliaoxiangmuTypes) {
						this.liliaoxiangmuTypes = liliaoxiangmuTypes;
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

					/**
					* 获取： 项目介绍
					*/
					public String getLiliaoxiangmuContent() {
						return liliaoxiangmuContent;
					}
					/**
					* 设置： 项目介绍
					*/
					public void setLiliaoxiangmuContent(String liliaoxiangmuContent) {
						this.liliaoxiangmuContent = liliaoxiangmuContent;
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
