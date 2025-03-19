package com.dao;

import com.entity.YishengqingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengqingjiaView;

/**
 * 医生请假 Dao 接口
 *
 * @author 
 */
public interface YishengqingjiaDao extends BaseMapper<YishengqingjiaEntity> {

   List<YishengqingjiaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
