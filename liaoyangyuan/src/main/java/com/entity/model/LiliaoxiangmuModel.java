package com.entity.model;

import com.entity.LiliaoxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 理疗项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LiliaoxiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 项目名称
     */
    private String liliaoxiangmuName;


    /**
     * 项目类型
     */
    private Integer liliaoxiangmuTypes;


    /**
     * 项目介绍
     */
    private String liliaoxiangmuContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：项目名称
	 */
    public String getLiliaoxiangmuName() {
        return liliaoxiangmuName;
    }


    /**
	 * 设置：项目名称
	 */
    public void setLiliaoxiangmuName(String liliaoxiangmuName) {
        this.liliaoxiangmuName = liliaoxiangmuName;
    }
    /**
	 * 获取：项目类型
	 */
    public Integer getLiliaoxiangmuTypes() {
        return liliaoxiangmuTypes;
    }


    /**
	 * 设置：项目类型
	 */
    public void setLiliaoxiangmuTypes(Integer liliaoxiangmuTypes) {
        this.liliaoxiangmuTypes = liliaoxiangmuTypes;
    }
    /**
	 * 获取：项目介绍
	 */
    public String getLiliaoxiangmuContent() {
        return liliaoxiangmuContent;
    }


    /**
	 * 设置：项目介绍
	 */
    public void setLiliaoxiangmuContent(String liliaoxiangmuContent) {
        this.liliaoxiangmuContent = liliaoxiangmuContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
