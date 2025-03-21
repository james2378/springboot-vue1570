package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BanjirenyuanEntity;
import com.entity.view.BanjirenyuanView;

import com.service.BanjirenyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 班级人员
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-01 08:00:56
 */
@RestController
@RequestMapping("/banjirenyuan")
public class BanjirenyuanController {
    @Autowired
    private BanjirenyuanService banjirenyuanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjirenyuanEntity banjirenyuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			banjirenyuan.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			banjirenyuan.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanjirenyuanEntity> ew = new EntityWrapper<BanjirenyuanEntity>();

		PageUtils page = banjirenyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjirenyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjirenyuanEntity banjirenyuan, 
		HttpServletRequest request){
        EntityWrapper<BanjirenyuanEntity> ew = new EntityWrapper<BanjirenyuanEntity>();

		PageUtils page = banjirenyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjirenyuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjirenyuanEntity banjirenyuan){
       	EntityWrapper<BanjirenyuanEntity> ew = new EntityWrapper<BanjirenyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banjirenyuan, "banjirenyuan")); 
        return R.ok().put("data", banjirenyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjirenyuanEntity banjirenyuan){
        EntityWrapper< BanjirenyuanEntity> ew = new EntityWrapper< BanjirenyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banjirenyuan, "banjirenyuan")); 
		BanjirenyuanView banjirenyuanView =  banjirenyuanService.selectView(ew);
		return R.ok("查询班级人员成功").put("data", banjirenyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjirenyuanEntity banjirenyuan = banjirenyuanService.selectById(id);
        return R.ok().put("data", banjirenyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjirenyuanEntity banjirenyuan = banjirenyuanService.selectById(id);
        return R.ok().put("data", banjirenyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjirenyuanEntity banjirenyuan, HttpServletRequest request){
    	banjirenyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjirenyuan);
        banjirenyuanService.insert(banjirenyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanjirenyuanEntity banjirenyuan, HttpServletRequest request){
    	banjirenyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjirenyuan);
        banjirenyuanService.insert(banjirenyuan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BanjirenyuanEntity banjirenyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banjirenyuan);
        banjirenyuanService.updateById(banjirenyuan);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<BanjirenyuanEntity> list = new ArrayList<BanjirenyuanEntity>();
        for(Long id : ids) {
            BanjirenyuanEntity banjirenyuan = banjirenyuanService.selectById(id);
            banjirenyuan.setSfsh(sfsh);
            banjirenyuan.setShhf(shhf);
            list.add(banjirenyuan);
        }
        banjirenyuanService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjirenyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
