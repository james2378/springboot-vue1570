package com.entity.vo;

import com.entity.BanjizhiweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班级职位
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-06-01 08:00:57
 */
public class BanjizhiweiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级职位
	 */
	
	private String banjizhiwei;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 任命日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date renmingriqi;
		
	/**
	 * 任命内容
	 */
	
	private String renmingneirong;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：班级职位
	 */
	 
	public void setBanjizhiwei(String banjizhiwei) {
		this.banjizhiwei = banjizhiwei;
	}
	
	/**
	 * 获取：班级职位
	 */
	public String getBanjizhiwei() {
		return banjizhiwei;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：任命日期
	 */
	 
	public void setRenmingriqi(Date renmingriqi) {
		this.renmingriqi = renmingriqi;
	}
	
	/**
	 * 获取：任命日期
	 */
	public Date getRenmingriqi() {
		return renmingriqi;
	}
				
	
	/**
	 * 设置：任命内容
	 */
	 
	public void setRenmingneirong(String renmingneirong) {
		this.renmingneirong = renmingneirong;
	}
	
	/**
	 * 获取：任命内容
	 */
	public String getRenmingneirong() {
		return renmingneirong;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
