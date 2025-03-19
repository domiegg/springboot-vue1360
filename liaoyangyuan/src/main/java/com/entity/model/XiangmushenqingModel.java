package com.entity.model;

import com.entity.XiangmushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 项目申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiangmushenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 理疗项目
     */
    private Integer liliaoxiangmuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请状态
     */
    private Integer xiangmushenqingYesnoTypes;


    /**
     * 申请结果
     */
    private String xiangmushenqingYesnoText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
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
	 * 获取：理疗项目
	 */
    public Integer getLiliaoxiangmuId() {
        return liliaoxiangmuId;
    }


    /**
	 * 设置：理疗项目
	 */
    public void setLiliaoxiangmuId(Integer liliaoxiangmuId) {
        this.liliaoxiangmuId = liliaoxiangmuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getXiangmushenqingYesnoTypes() {
        return xiangmushenqingYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setXiangmushenqingYesnoTypes(Integer xiangmushenqingYesnoTypes) {
        this.xiangmushenqingYesnoTypes = xiangmushenqingYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getXiangmushenqingYesnoText() {
        return xiangmushenqingYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setXiangmushenqingYesnoText(String xiangmushenqingYesnoText) {
        this.xiangmushenqingYesnoText = xiangmushenqingYesnoText;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：回复时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
