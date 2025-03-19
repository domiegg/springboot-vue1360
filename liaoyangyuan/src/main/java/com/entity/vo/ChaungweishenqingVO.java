package com.entity.vo;

import com.entity.ChaungweishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 床位申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chaungweishenqing")
public class ChaungweishenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 床位
     */

    @TableField(value = "chuangwei_id")
    private Integer chuangweiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 申请状态
     */

    @TableField(value = "chaungweishenqing_yesno_types")
    private Integer chaungweishenqingYesnoTypes;


    /**
     * 申请结果
     */

    @TableField(value = "chaungweishenqing_yesno_text")
    private String chaungweishenqingYesnoText;


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
	 * 设置：床位
	 */
    public Integer getChuangweiId() {
        return chuangweiId;
    }


    /**
	 * 获取：床位
	 */

    public void setChuangweiId(Integer chuangweiId) {
        this.chuangweiId = chuangweiId;
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
    public Integer getChaungweishenqingYesnoTypes() {
        return chaungweishenqingYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setChaungweishenqingYesnoTypes(Integer chaungweishenqingYesnoTypes) {
        this.chaungweishenqingYesnoTypes = chaungweishenqingYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getChaungweishenqingYesnoText() {
        return chaungweishenqingYesnoText;
    }


    /**
	 * 获取：申请结果
	 */

    public void setChaungweishenqingYesnoText(String chaungweishenqingYesnoText) {
        this.chaungweishenqingYesnoText = chaungweishenqingYesnoText;
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
