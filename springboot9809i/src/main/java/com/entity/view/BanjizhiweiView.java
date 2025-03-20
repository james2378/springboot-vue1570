package com.entity.view;

import com.entity.BanjizhiweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级职位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-06-01 08:00:57
 */
@TableName("banjizhiwei")
public class BanjizhiweiView  extends BanjizhiweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjizhiweiView(){
	}
 
 	public BanjizhiweiView(BanjizhiweiEntity banjizhiweiEntity){
 	try {
			BeanUtils.copyProperties(this, banjizhiweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
