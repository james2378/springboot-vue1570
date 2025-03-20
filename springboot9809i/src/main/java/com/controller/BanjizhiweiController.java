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

import com.entity.BanjizhiweiEntity;
import com.entity.view.BanjizhiweiView;

import com.service.BanjizhiweiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 班级职位
 * 后端接口
 * @author 
 * @email 
 * @date 2023-06-01 08:00:57
 */
@RestController
@RequestMapping("/banjizhiwei")
public class BanjizhiweiController {
    @Autowired
    private BanjizhiweiService banjizhiweiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjizhiweiEntity banjizhiwei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			banjizhiwei.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			banjizhiwei.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanjizhiweiEntity> ew = new EntityWrapper<BanjizhiweiEntity>();

		PageUtils page = banjizhiweiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjizhiwei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjizhiweiEntity banjizhiwei, 
		HttpServletRequest request){
        EntityWrapper<BanjizhiweiEntity> ew = new EntityWrapper<BanjizhiweiEntity>();

		PageUtils page = banjizhiweiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjizhiwei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjizhiweiEntity banjizhiwei){
       	EntityWrapper<BanjizhiweiEntity> ew = new EntityWrapper<BanjizhiweiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banjizhiwei, "banjizhiwei")); 
        return R.ok().put("data", banjizhiweiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjizhiweiEntity banjizhiwei){
        EntityWrapper< BanjizhiweiEntity> ew = new EntityWrapper< BanjizhiweiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banjizhiwei, "banjizhiwei")); 
		BanjizhiweiView banjizhiweiView =  banjizhiweiService.selectView(ew);
		return R.ok("查询班级职位成功").put("data", banjizhiweiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjizhiweiEntity banjizhiwei = banjizhiweiService.selectById(id);
        return R.ok().put("data", banjizhiwei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjizhiweiEntity banjizhiwei = banjizhiweiService.selectById(id);
        return R.ok().put("data", banjizhiwei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjizhiweiEntity banjizhiwei, HttpServletRequest request){
    	banjizhiwei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjizhiwei);
        banjizhiweiService.insert(banjizhiwei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanjizhiweiEntity banjizhiwei, HttpServletRequest request){
    	banjizhiwei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjizhiwei);
        banjizhiweiService.insert(banjizhiwei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BanjizhiweiEntity banjizhiwei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banjizhiwei);
        banjizhiweiService.updateById(banjizhiwei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjizhiweiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
