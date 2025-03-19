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
 * 理疗项目
 *
 * @author 
 * @email
 */
@TableName("liliaoxiangmu")
public class LiliaoxiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LiliaoxiangmuEntity() {

	}

	public LiliaoxiangmuEntity(T t) {
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
     * 项目名称
     */
    @TableField(value = "liliaoxiangmu_name")

    private String liliaoxiangmuName;


    /**
     * 项目类型
     */
    @TableField(value = "liliaoxiangmu_types")

    private Integer liliaoxiangmuTypes;


    /**
     * 项目介绍
     */
    @TableField(value = "liliaoxiangmu_content")

    private String liliaoxiangmuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：项目名称
	 */
    public String getLiliaoxiangmuName() {
        return liliaoxiangmuName;
    }
    /**
	 * 获取：项目名称
	 */

    public void setLiliaoxiangmuName(String liliaoxiangmuName) {
        this.liliaoxiangmuName = liliaoxiangmuName;
    }
    /**
	 * 设置：项目类型
	 */
    public Integer getLiliaoxiangmuTypes() {
        return liliaoxiangmuTypes;
    }
    /**
	 * 获取：项目类型
	 */

    public void setLiliaoxiangmuTypes(Integer liliaoxiangmuTypes) {
        this.liliaoxiangmuTypes = liliaoxiangmuTypes;
    }
    /**
	 * 设置：项目介绍
	 */
    public String getLiliaoxiangmuContent() {
        return liliaoxiangmuContent;
    }
    /**
	 * 获取：项目介绍
	 */

    public void setLiliaoxiangmuContent(String liliaoxiangmuContent) {
        this.liliaoxiangmuContent = liliaoxiangmuContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Liliaoxiangmu{" +
            "id=" + id +
            ", liliaoxiangmuName=" + liliaoxiangmuName +
            ", liliaoxiangmuTypes=" + liliaoxiangmuTypes +
            ", liliaoxiangmuContent=" + liliaoxiangmuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
