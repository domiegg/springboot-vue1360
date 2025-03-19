package com.entity.vo;

import com.entity.LiliaoxiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 理疗项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("liliaoxiangmu")
public class LiliaoxiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
