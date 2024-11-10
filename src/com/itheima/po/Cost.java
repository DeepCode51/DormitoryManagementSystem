package com.itheima.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @program: dormitorySystem
 * @description: 水电费
 * @author: Joyrocky
 * @create: 2019-05-14 00:37
 **/
public class Cost {
    private Integer id;
    private Integer dormitoryid;
    private double waterprice;
    private double electricityprice;
    private double sumprice;
    private String status;
    private String remark;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_time;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDormitoryid() {
		return dormitoryid;
	}
	public void setDormitoryid(Integer dormitoryid) {
		this.dormitoryid = dormitoryid;
	}
	public double getWaterprice() {
		return waterprice;
	}
	public void setWaterprice(double waterprice) {
		this.waterprice = waterprice;
	}
	public double getElectricityprice() {
		return electricityprice;
	}
	public void setElectricityprice(double electricityprice) {
		this.electricityprice = electricityprice;
	}
	public double getSumprice() {
		return sumprice;
	}
	public void setSumprice(double sumprice) {
		this.sumprice = sumprice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

    
}

