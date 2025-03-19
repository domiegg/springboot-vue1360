package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 项目申请
 *
 * @author 
 * @email
 */
@TableName("xiangmushenqing")
public class XiangmushenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangmushenqingEntity() {

	}

	public XiangmushenqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 理疗项目
     */
    @TableField(value = "liliaoxiangmu_id")

    private Integer liliaoxiangmuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请状态
     */
    @TableField(value = "xiangmushenqing_yesno_types")

    private Integer xiangmushenqingYesnoTypes;


    /**
     * 申请结果
     */
    @TableField(value = "xiangmushenqing_yesno_text")

    private String xiangmushenqingYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：理疗项目
	 */
    public Integer getLiliaoxiangmuId() {
        return liliaoxiangmuId;
    }
    /**
	 * 获取：理疗项目
	 */

    public void setLiliaoxiangmuId(Integer liliaoxiangmuId) {
        this.liliaoxiangmuId = liliaoxiangmuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getXiangmushenqingYesnoTypes() {
        return xiangmushenqingYesnoTypes;
    }
    /**
	 * 获取：申请状态
	 */

    public void setXiangmushenqingYesnoTypes(Integer xiangmushenqingYesnoTypes) {
        this.xiangmushenqingYesnoTypes = xiangmushenqingYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getXiangmushenqingYesnoText() {
        return xiangmushenqingYesnoText;
    }
    /**
	 * 获取：申请结果
	 */

    public void setXiangmushenqingYesnoText(String xiangmushenqingYesnoText) {
        this.xiangmushenqingYesnoText = xiangmushenqingYesnoText;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
	 * 获取：回复时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiangmushenqing{" +
            "id=" + id +
            ", liliaoxiangmuId=" + liliaoxiangmuId +
            ", yonghuId=" + yonghuId +
            ", xiangmushenqingYesnoTypes=" + xiangmushenqingYesnoTypes +
            ", xiangmushenqingYesnoText=" + xiangmushenqingYesnoText +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
