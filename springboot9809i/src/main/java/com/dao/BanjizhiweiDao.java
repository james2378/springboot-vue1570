package com.dao;

import com.entity.BanjizhiweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjizhiweiVO;
import com.entity.view.BanjizhiweiView;


/**
 * 班级职位
 * 
 * @author 
 * @email 
 * @date 2023-06-01 08:00:57
 */
public interface BanjizhiweiDao extends BaseMapper<BanjizhiweiEntity> {
	
	List<BanjizhiweiVO> selectListVO(@Param("ew") Wrapper<BanjizhiweiEntity> wrapper);
	
	BanjizhiweiVO selectVO(@Param("ew") Wrapper<BanjizhiweiEntity> wrapper);
	
	List<BanjizhiweiView> selectListView(@Param("ew") Wrapper<BanjizhiweiEntity> wrapper);

	List<BanjizhiweiView> selectListView(Pagination page,@Param("ew") Wrapper<BanjizhiweiEntity> wrapper);
	
	BanjizhiweiView selectView(@Param("ew") Wrapper<BanjizhiweiEntity> wrapper);
	

}
