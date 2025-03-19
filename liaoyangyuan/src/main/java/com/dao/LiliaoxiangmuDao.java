package com.dao;

import com.entity.LiliaoxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LiliaoxiangmuView;

/**
 * 理疗项目 Dao 接口
 *
 * @author 
 */
public interface LiliaoxiangmuDao extends BaseMapper<LiliaoxiangmuEntity> {

   List<LiliaoxiangmuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
