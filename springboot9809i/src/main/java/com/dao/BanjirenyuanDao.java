package com.dao;

import com.entity.BanjirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjirenyuanVO;
import com.entity.view.BanjirenyuanView;


/**
 * 班级人员
 * 
 * @author 
 * @email 
 * @date 2023-06-01 08:00:56
 */
public interface BanjirenyuanDao extends BaseMapper<BanjirenyuanEntity> {
	
	List<BanjirenyuanVO> selectListVO(@Param("ew") Wrapper<BanjirenyuanEntity> wrapper);
	
	BanjirenyuanVO selectVO(@Param("ew") Wrapper<BanjirenyuanEntity> wrapper);
	
	List<BanjirenyuanView> selectListView(@Param("ew") Wrapper<BanjirenyuanEntity> wrapper);

	List<BanjirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<BanjirenyuanEntity> wrapper);
	
	BanjirenyuanView selectView(@Param("ew") Wrapper<BanjirenyuanEntity> wrapper);
	

}
