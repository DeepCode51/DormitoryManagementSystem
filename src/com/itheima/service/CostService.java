package com.itheima.service;
import com.itheima.po.Class;
import com.itheima.po.Cost;
import com.itheima.po.PageInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 用户Service层接口
 */
public interface CostService {

    //获取用户列表
    public PageInfo<Cost> findPageInfo(Integer dormitoryid, Integer pageIndex, Integer pageSize);

    public int addCost(Cost cost);   //添加
    public int updateCost(Cost cost);    //修改
    public int deleteCost(Integer id);   //删除
    public List<Cost> getAll();

	Cost findCostById(Integer id);
}
