package com.entity.vo;

import com.entity.XiangmushenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 项目申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiangmushenqing")
public class XiangmushenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
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

}
