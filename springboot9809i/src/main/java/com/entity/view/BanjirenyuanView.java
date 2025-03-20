package com.entity.view;

import com.entity.BanjirenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-06-01 08:00:56
 */
@TableName("banjirenyuan")
public class BanjirenyuanView  extends BanjirenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjirenyuanView(){
	}
 
 	public BanjirenyuanView(BanjirenyuanEntity banjirenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, banjirenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
