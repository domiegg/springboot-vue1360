package com.entity.model;

import com.entity.YizhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医嘱
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YizhuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String yizhuName;


    /**
     * 患者
     */
    private Integer yonghuId;


    /**
     * 病情
     */
    private String yizhuBingqing;


    /**
     * 检查项目
     */
    private String jianchaxiangmu;


    /**
     * 检查结果
     */
    private String jianchajieguo;


    /**
     * 药单
     */
    private String yaodanText;


    /**
     * 医嘱
     */
    private String yizhuText;


    /**
     * 注意事项
     */
    private String zhuyishixiang;


    /**
     * 病例附件
     */
    private String yizhuFile;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yizhuTime;


    /**
     * 医生
     */
    private Integer yishengId;


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
	 * 获取：标题
	 */
    public String getYizhuName() {
        return yizhuName;
    }


    /**
	 * 设置：标题
	 */
    public void setYizhuName(String yizhuName) {
        this.yizhuName = yizhuName;
    }
    /**
	 * 获取：患者
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：患者
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：病情
	 */
    public String getYizhuBingqing() {
        return yizhuBingqing;
    }


    /**
	 * 设置：病情
	 */
    public void setYizhuBingqing(String yizhuBingqing) {
        this.yizhuBingqing = yizhuBingqing;
    }
    /**
	 * 获取：检查项目
	 */
    public String getJianchaxiangmu() {
        return jianchaxiangmu;
    }


    /**
	 * 设置：检查项目
	 */
    public void setJianchaxiangmu(String jianchaxiangmu) {
        this.jianchaxiangmu = jianchaxiangmu;
    }
    /**
	 * 获取：检查结果
	 */
    public String getJianchajieguo() {
        return jianchajieguo;
    }


    /**
	 * 设置：检查结果
	 */
    public void setJianchajieguo(String jianchajieguo) {
        this.jianchajieguo = jianchajieguo;
    }
    /**
	 * 获取：药单
	 */
    public String getYaodanText() {
        return yaodanText;
    }


    /**
	 * 设置：药单
	 */
    public void setYaodanText(String yaodanText) {
        this.yaodanText = yaodanText;
    }
    /**
	 * 获取：医嘱
	 */
    public String getYizhuText() {
        return yizhuText;
    }


    /**
	 * 设置：医嘱
	 */
    public void setYizhuText(String yizhuText) {
        this.yizhuText = yizhuText;
    }
    /**
	 * 获取：注意事项
	 */
    public String getZhuyishixiang() {
        return zhuyishixiang;
    }


    /**
	 * 设置：注意事项
	 */
    public void setZhuyishixiang(String zhuyishixiang) {
        this.zhuyishixiang = zhuyishixiang;
    }
    /**
	 * 获取：病例附件
	 */
    public String getYizhuFile() {
        return yizhuFile;
    }


    /**
	 * 设置：病例附件
	 */
    public void setYizhuFile(String yizhuFile) {
        this.yizhuFile = yizhuFile;
    }
    /**
	 * 获取：日期
	 */
    public Date getYizhuTime() {
        return yizhuTime;
    }


    /**
	 * 设置：日期
	 */
    public void setYizhuTime(Date yizhuTime) {
        this.yizhuTime = yizhuTime;
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
