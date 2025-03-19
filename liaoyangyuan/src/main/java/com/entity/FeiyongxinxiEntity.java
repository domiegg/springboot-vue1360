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
 * 费用信息
 *
 * @author 
 * @email
 */
@TableName("feiyongxinxi")
public class FeiyongxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FeiyongxinxiEntity() {

	}

	public FeiyongxinxiEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 缴费项目
     */
    @TableField(value = "feiyongxinxi_name")

    private String feiyongxinxiName;


    /**
     * 缴费类型
     */
    @TableField(value = "feiyongxinxi_types")

    private Integer feiyongxinxiTypes;


    /**
     * 缴费金额
     */
    @TableField(value = "feiyongxinxi_new_money")

    private Double feiyongxinxiNewMoney;


    /**
     * 缴费详情
     */
    @TableField(value = "feiyongxinxi_text")

    private String feiyongxinxiText;


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
	 * 设置：缴费项目
	 */
    public String getFeiyongxinxiName() {
        return feiyongxinxiName;
    }
    /**
	 * 获取：缴费项目
	 */

    public void setFeiyongxinxiName(String feiyongxinxiName) {
        this.feiyongxinxiName = feiyongxinxiName;
    }
    /**
	 * 设置：缴费类型
	 */
    public Integer getFeiyongxinxiTypes() {
        return feiyongxinxiTypes;
    }
    /**
	 * 获取：缴费类型
	 */

    public void setFeiyongxinxiTypes(Integer feiyongxinxiTypes) {
        this.feiyongxinxiTypes = feiyongxinxiTypes;
    }
    /**
	 * 设置：缴费金额
	 */
    public Double getFeiyongxinxiNewMoney() {
        return feiyongxinxiNewMoney;
    }
    /**
	 * 获取：缴费金额
	 */

    public void setFeiyongxinxiNewMoney(Double feiyongxinxiNewMoney) {
        this.feiyongxinxiNewMoney = feiyongxinxiNewMoney;
    }
    /**
	 * 设置：缴费详情
	 */
    public String getFeiyongxinxiText() {
        return feiyongxinxiText;
    }
    /**
	 * 获取：缴费详情
	 */

    public void setFeiyongxinxiText(String feiyongxinxiText) {
        this.feiyongxinxiText = feiyongxinxiText;
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
        return "Feiyongxinxi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", feiyongxinxiName=" + feiyongxinxiName +
            ", feiyongxinxiTypes=" + feiyongxinxiTypes +
            ", feiyongxinxiNewMoney=" + feiyongxinxiNewMoney +
            ", feiyongxinxiText=" + feiyongxinxiText +
            ", createTime=" + createTime +
        "}";
    }
}
