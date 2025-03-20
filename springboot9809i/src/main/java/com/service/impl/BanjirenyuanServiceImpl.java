package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BanjirenyuanDao;
import com.entity.BanjirenyuanEntity;
import com.service.BanjirenyuanService;
import com.entity.vo.BanjirenyuanVO;
import com.entity.view.BanjirenyuanView;

@Service("banjirenyuanService")
public class BanjirenyuanServiceImpl extends ServiceImpl<BanjirenyuanDao, BanjirenyuanEntity> implements BanjirenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjirenyuanEntity> page = this.selectPage(
                new Query<BanjirenyuanEntity>(params).getPage(),
                new EntityWrapper<BanjirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjirenyuanEntity> wrapper) {
		  Page<BanjirenyuanView> page =new Query<BanjirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjirenyuanVO> selectListVO(Wrapper<BanjirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjirenyuanVO selectVO(Wrapper<BanjirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjirenyuanView> selectListView(Wrapper<BanjirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjirenyuanView selectView(Wrapper<BanjirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
