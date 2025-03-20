package com.entity.vo;

import com.entity.BanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班级信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-06-01 08:00:56
 */
public class BanjixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级人数
	 */
	
	private Integer banjirenshu;
		
	/**
	 * 班级图片
	 */
	
	private String banjitupian;
		
	/**
	 * 班级位置
	 */
	
	private String banjiweizhi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 班级介绍
	 */
	
	private String banjijieshao;
				
	
	/**
	 * 设置：班级人数
	 */
	 
	public void setBanjirenshu(Integer banjirenshu) {
		this.banjirenshu = banjirenshu;
	}
	
	/**
	 * 获取：班级人数
	 */
	public Integer getBanjirenshu() {
		return banjirenshu;
	}
				
	
	/**
	 * 设置：班级图片
	 */
	 
	public void setBanjitupian(String banjitupian) {
		this.banjitupian = banjitupian;
	}
	
	/**
	 * 获取：班级图片
	 */
	public String getBanjitupian() {
		return banjitupian;
	}
				
	
	/**
	 * 设置：班级位置
	 */
	 
	public void setBanjiweizhi(String banjiweizhi) {
		this.banjiweizhi = banjiweizhi;
	}
	
	/**
	 * 获取：班级位置
	 */
	public String getBanjiweizhi() {
		return banjiweizhi;
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
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：班级介绍
	 */
	 
	public void setBanjijieshao(String banjijieshao) {
		this.banjijieshao = banjijieshao;
	}
	
	/**
	 * 获取：班级介绍
	 */
	public String getBanjijieshao() {
		return banjijieshao;
	}
			
}
