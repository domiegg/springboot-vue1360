
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 床位申请
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chaungweishenqing")
public class ChaungweishenqingController {
    private static final Logger logger = LoggerFactory.getLogger(ChaungweishenqingController.class);

    @Autowired
    private ChaungweishenqingService chaungweishenqingService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ChuangweiService chuangweiService;
    @Autowired
    private YonghuService yonghuService;

    @Autowired
    private YishengService yishengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("患者".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("医生".equals(role))
            params.put("yishengId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = chaungweishenqingService.queryPage(params);

        //字典表数据转换
        List<ChaungweishenqingView> list =(List<ChaungweishenqingView>)page.getList();
        for(ChaungweishenqingView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChaungweishenqingEntity chaungweishenqing = chaungweishenqingService.selectById(id);
        if(chaungweishenqing !=null){
            //entity转view
            ChaungweishenqingView view = new ChaungweishenqingView();
            BeanUtils.copyProperties( chaungweishenqing , view );//把实体数据重构到view中

                //级联表
                ChuangweiEntity chuangwei = chuangweiService.selectById(chaungweishenqing.getChuangweiId());
                if(chuangwei != null){
                    BeanUtils.copyProperties( chuangwei , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setChuangweiId(chuangwei.getId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(chaungweishenqing.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ChaungweishenqingEntity chaungweishenqing, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chaungweishenqing:{}",this.getClass().getName(),chaungweishenqing.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("患者".equals(role))
            chaungweishenqing.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ChaungweishenqingEntity> queryWrapper = new EntityWrapper<ChaungweishenqingEntity>()
            .eq("yonghu_id", chaungweishenqing.getYonghuId())
            .in("chaungweishenqing_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChaungweishenqingEntity chaungweishenqingEntity = chaungweishenqingService.selectOne(queryWrapper);
        if(chaungweishenqingEntity==null){
            chaungweishenqing.setChaungweishenqingYesnoTypes(1);
            chaungweishenqing.setCreateTime(new Date());
            chaungweishenqingService.insert(chaungweishenqing);
            return R.ok();
        }else {
            return R.error(511,"一个患者只可以有一个床位");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChaungweishenqingEntity chaungweishenqing, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,chaungweishenqing:{}",this.getClass().getName(),chaungweishenqing.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("患者".equals(role))
//            chaungweishenqing.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ChaungweishenqingEntity> queryWrapper = new EntityWrapper<ChaungweishenqingEntity>()
            .notIn("id",chaungweishenqing.getId())
            .andNew()
            .eq("chuangwei_id", chaungweishenqing.getChuangweiId())
            .eq("yonghu_id", chaungweishenqing.getYonghuId())
            .eq("chaungweishenqing_yesno_types", chaungweishenqing.getChaungweishenqingYesnoTypes())
            .eq("chaungweishenqing_yesno_text", chaungweishenqing.getChaungweishenqingYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChaungweishenqingEntity chaungweishenqingEntity = chaungweishenqingService.selectOne(queryWrapper);
        chaungweishenqing.setUpdateTime(new Date());
        if(chaungweishenqingEntity==null){
            chaungweishenqingService.updateById(chaungweishenqing);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody ChaungweishenqingEntity chaungweishenqing, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,chaungweishenqing:{}",this.getClass().getName(),chaungweishenqing.toString());

        if(chaungweishenqing.getChaungweishenqingYesnoTypes() == 2){
            //查询床位申请信息
            ChaungweishenqingEntity chaungweishenqingEntity1 = chaungweishenqingService.selectById(chaungweishenqing.getId());
            //查询床位状态
            ChuangweiEntity chuangweiEntity = chuangweiService.selectById(chaungweishenqingEntity1.getChuangweiId());
            if(chuangweiEntity.getChuangweiTypes() == 2){
                return R.error("该床位已使用");
            }
            chuangweiEntity.setChuangweiTypes(2);
            chuangweiService.updateById(chuangweiEntity);
        }
        chaungweishenqingService.updateById(chaungweishenqing);//审核
        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        chaungweishenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ChaungweishenqingEntity> chaungweishenqingList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ChaungweishenqingEntity chaungweishenqingEntity = new ChaungweishenqingEntity();
//                            chaungweishenqingEntity.setChuangweiId(Integer.valueOf(data.get(0)));   //床位 要改的
//                            chaungweishenqingEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            chaungweishenqingEntity.setChaungweishenqingYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            chaungweishenqingEntity.setChaungweishenqingYesnoText(data.get(0));                    //申请结果 要改的
//                            chaungweishenqingEntity.setUpdateTime(sdf.parse(data.get(0)));          //回复时间 要改的
//                            chaungweishenqingEntity.setCreateTime(date);//时间
                            chaungweishenqingList.add(chaungweishenqingEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        chaungweishenqingService.insertBatch(chaungweishenqingList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
