package com.entity.vo;

import com.entity.YishengqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 医生请假
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yishengqingjia")
public class YishengqingjiaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 请假原因
     */

    @TableField(value = "yishengqingjia_name")
    private String yishengqingjiaName;


    /**
     * 详情
     */

    @TableField(value = "yishengqingjia_text")
    private String yishengqingjiaText;


    /**
     * 请假类型
     */

    @TableField(value = "qingjia_types")
    private Integer qingjiaTypes;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yishengqingjia_time")
    private Date yishengqingjiaTime;


    /**
     * 请假天数
     */

    @TableField(value = "yishengqingjia_number")
    private Integer yishengqingjiaNumber;


    /**
     * 医生
     */

    @TableField(value = "yisheng_id")
    private Integer yishengId;


    /**
     * 审核结果
     */

    @TableField(value = "yishengqingjia_yesno_types")
    private Integer yishengqingjiaYesnoTypes;


    /**
     * 处理结果
     */

    @TableField(value = "yishengqingjia_yesno_text")
    private String yishengqingjiaYesnoText;


    /**
     * 创建时间
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
	 * 设置：请假原因
	 */
    public String getYishengqingjiaName() {
        return yishengqingjiaName;
    }


    /**
	 * 获取：请假原因
	 */

    public void setYishengqingjiaName(String yishengqingjiaName) {
        this.yishengqingjiaName = yishengqingjiaName;
    }
    /**
	 * 设置：详情
	 */
    public String getYishengqingjiaText() {
        return yishengqingjiaText;
    }


    /**
	 * 获取：详情
	 */

    public void setYishengqingjiaText(String yishengqingjiaText) {
        this.yishengqingjiaText = yishengqingjiaText;
    }
    /**
	 * 设置：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }


    /**
	 * 获取：请假类型
	 */

    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
    }
    /**
	 * 设置：请假时间
	 */
    public Date getYishengqingjiaTime() {
        return yishengqingjiaTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setYishengqingjiaTime(Date yishengqingjiaTime) {
        this.yishengqingjiaTime = yishengqingjiaTime;
    }
    /**
	 * 设置：请假天数
	 */
    public Integer getYishengqingjiaNumber() {
        return yishengqingjiaNumber;
    }


    /**
	 * 获取：请假天数
	 */

    public void setYishengqingjiaNumber(Integer yishengqingjiaNumber) {
        this.yishengqingjiaNumber = yishengqingjiaNumber;
    }
    /**
	 * 设置：医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 获取：医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getYishengqingjiaYesnoTypes() {
        return yishengqingjiaYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setYishengqingjiaYesnoTypes(Integer yishengqingjiaYesnoTypes) {
        this.yishengqingjiaYesnoTypes = yishengqingjiaYesnoTypes;
    }
    /**
	 * 设置：处理结果
	 */
    public String getYishengqingjiaYesnoText() {
        return yishengqingjiaYesnoText;
    }


    /**
	 * 获取：处理结果
	 */

    public void setYishengqingjiaYesnoText(String yishengqingjiaYesnoText) {
        this.yishengqingjiaYesnoText = yishengqingjiaYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：创建时间
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
