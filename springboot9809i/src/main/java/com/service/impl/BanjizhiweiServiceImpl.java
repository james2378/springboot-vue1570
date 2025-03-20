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


import com.dao.BanjizhiweiDao;
import com.entity.BanjizhiweiEntity;
import com.service.BanjizhiweiService;
import com.entity.vo.BanjizhiweiVO;
import com.entity.view.BanjizhiweiView;

@Service("banjizhiweiService")
public class BanjizhiweiServiceImpl extends ServiceImpl<BanjizhiweiDao, BanjizhiweiEntity> implements BanjizhiweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjizhiweiEntity> page = this.selectPage(
                new Query<BanjizhiweiEntity>(params).getPage(),
                new EntityWrapper<BanjizhiweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjizhiweiEntity> wrapper) {
		  Page<BanjizhiweiView> page =new Query<BanjizhiweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjizhiweiVO> selectListVO(Wrapper<BanjizhiweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjizhiweiVO selectVO(Wrapper<BanjizhiweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjizhiweiView> selectListView(Wrapper<BanjizhiweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjizhiweiView selectView(Wrapper<BanjizhiweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
