package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 班级职位
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-06-01 08:00:57
 */
@TableName("banjizhiwei")
public class BanjizhiweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanjizhiweiEntity() {
		
	}
	
	public BanjizhiweiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 班级名称
	 */
					
	private String banjimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：班级名称
	 */
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
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
