package com.entity.vo;

import com.entity.FeiyongxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 费用信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("feiyongxinxi")
public class FeiyongxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
