package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjizhiweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjizhiweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjizhiweiView;


/**
 * 班级职位
 *
 * @author 
 * @email 
 * @date 2023-06-01 08:00:57
 */
public interface BanjizhiweiService extends IService<BanjizhiweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjizhiweiVO> selectListVO(Wrapper<BanjizhiweiEntity> wrapper);
   	
   	BanjizhiweiVO selectVO(@Param("ew") Wrapper<BanjizhiweiEntity> wrapper);
   	
   	List<BanjizhiweiView> selectListView(Wrapper<BanjizhiweiEntity> wrapper);
   	
   	BanjizhiweiView selectView(@Param("ew") Wrapper<BanjizhiweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjizhiweiEntity> wrapper);
   	

}

