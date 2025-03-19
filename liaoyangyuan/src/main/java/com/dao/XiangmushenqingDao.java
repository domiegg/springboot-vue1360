package com.dao;

import com.entity.XiangmushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmushenqingView;

/**
 * 项目申请 Dao 接口
 *
 * @author 
 */
public interface XiangmushenqingDao extends BaseMapper<XiangmushenqingEntity> {

   List<XiangmushenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
