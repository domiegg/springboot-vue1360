package com.entity.model;

import com.entity.YishengqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医生请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YishengqingjiaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 请假原因
     */
    private String yishengqingjiaName;


    /**
     * 详情
     */
    private String yishengqingjiaText;


    /**
     * 请假类型
     */
    private Integer qingjiaTypes;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yishengqingjiaTime;


    /**
     * 请假天数
     */
    private Integer yishengqingjiaNumber;


    /**
     * 医生
     */
    private Integer yishengId;


    /**
     * 审核结果
     */
    private Integer yishengqingjiaYesnoTypes;


    /**
     * 处理结果
     */
    private String yishengqingjiaYesnoText;


    /**
     * 创建时间
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
	 * 获取：请假原因
	 */
    public String getYishengqingjiaName() {
        return yishengqingjiaName;
    }


    /**
	 * 设置：请假原因
	 */
    public void setYishengqingjiaName(String yishengqingjiaName) {
        this.yishengqingjiaName = yishengqingjiaName;
    }
    /**
	 * 获取：详情
	 */
    public String getYishengqingjiaText() {
        return yishengqingjiaText;
    }


    /**
	 * 设置：详情
	 */
    public void setYishengqingjiaText(String yishengqingjiaText) {
        this.yishengqingjiaText = yishengqingjiaText;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }


    /**
	 * 设置：请假类型
	 */
    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getYishengqingjiaTime() {
        return yishengqingjiaTime;
    }


    /**
	 * 设置：请假时间
	 */
    public void setYishengqingjiaTime(Date yishengqingjiaTime) {
        this.yishengqingjiaTime = yishengqingjiaTime;
    }
    /**
	 * 获取：请假天数
	 */
    public Integer getYishengqingjiaNumber() {
        return yishengqingjiaNumber;
    }


    /**
	 * 设置：请假天数
	 */
    public void setYishengqingjiaNumber(Integer yishengqingjiaNumber) {
        this.yishengqingjiaNumber = yishengqingjiaNumber;
    }
    /**
	 * 获取：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getYishengqingjiaYesnoTypes() {
        return yishengqingjiaYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setYishengqingjiaYesnoTypes(Integer yishengqingjiaYesnoTypes) {
        this.yishengqingjiaYesnoTypes = yishengqingjiaYesnoTypes;
    }
    /**
	 * 获取：处理结果
	 */
    public String getYishengqingjiaYesnoText() {
        return yishengqingjiaYesnoText;
    }


    /**
	 * 设置：处理结果
	 */
    public void setYishengqingjiaYesnoText(String yishengqingjiaYesnoText) {
        this.yishengqingjiaYesnoText = yishengqingjiaYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：创建时间
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
