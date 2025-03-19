package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmushenqingEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 项目申请 服务类
 */
public interface XiangmushenqingService extends IService<XiangmushenqingEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}