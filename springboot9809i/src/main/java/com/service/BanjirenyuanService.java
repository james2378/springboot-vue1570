package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjirenyuanView;


/**
 * 班级人员
 *
 * @author 
 * @email 
 * @date 2023-06-01 08:00:56
 */
public interface BanjirenyuanService extends IService<BanjirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjirenyuanVO> selectListVO(Wrapper<BanjirenyuanEntity> wrapper);
   	
   	BanjirenyuanVO selectVO(@Param("ew") Wrapper<BanjirenyuanEntity> wrapper);
   	
   	List<BanjirenyuanView> selectListView(Wrapper<BanjirenyuanEntity> wrapper);
   	
   	BanjirenyuanView selectView(@Param("ew") Wrapper<BanjirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjirenyuanEntity> wrapper);
   	

}

