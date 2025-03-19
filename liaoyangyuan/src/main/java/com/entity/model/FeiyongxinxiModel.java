package com.entity.model;

import com.entity.FeiyongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 费用信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FeiyongxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 缴费项目
     */
    private String feiyongxinxiName;


    /**
     * 缴费类型
     */
    private Integer feiyongxinxiTypes;


    /**
     * 缴费金额
     */
    private Double feiyongxinxiNewMoney;


    /**
     * 缴费详情
     */
    private String feiyongxinxiText;


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
	 * 获取：缴费项目
	 */
    public String getFeiyongxinxiName() {
        return feiyongxinxiName;
    }


    /**
	 * 设置：缴费项目
	 */
    public void setFeiyongxinxiName(String feiyongxinxiName) {
        this.feiyongxinxiName = feiyongxinxiName;
    }
    /**
	 * 获取：缴费类型
	 */
    public Integer getFeiyongxinxiTypes() {
        return feiyongxinxiTypes;
    }


    /**
	 * 设置：缴费类型
	 */
    public void setFeiyongxinxiTypes(Integer feiyongxinxiTypes) {
        this.feiyongxinxiTypes = feiyongxinxiTypes;
    }
    /**
	 * 获取：缴费金额
	 */
    public Double getFeiyongxinxiNewMoney() {
        return feiyongxinxiNewMoney;
    }


    /**
	 * 设置：缴费金额
	 */
    public void setFeiyongxinxiNewMoney(Double feiyongxinxiNewMoney) {
        this.feiyongxinxiNewMoney = feiyongxinxiNewMoney;
    }
    /**
	 * 获取：缴费详情
	 */
    public String getFeiyongxinxiText() {
        return feiyongxinxiText;
    }


    /**
	 * 设置：缴费详情
	 */
    public void setFeiyongxinxiText(String feiyongxinxiText) {
        this.feiyongxinxiText = feiyongxinxiText;
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
