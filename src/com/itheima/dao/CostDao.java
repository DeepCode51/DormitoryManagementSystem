package com.itheima.dao;

import com.itheima.po.Class;
import com.itheima.po.Cost;
import com.itheima.po.Visitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 访客
 * @author: Joyrocky
 * @create: 2019-05-14 12:57
 **/
public interface CostDao {
    /**
     * 进行分页查询
     */

    //获取总条数
    public Integer totalCount(@Param("dormitoryid") Integer dormitoryid);
    //获取用户列表
    public List<Cost> getCostList(@Param("dormitoryid") Integer dormitoryid,@Param("currentPage")Integer currentPage, @Param("pageSize")Integer pageSize);

    public int addCost(Cost cost);   //添加
    public int updateCost(Cost cost);    //修改
    public int deleteCost(Integer id);   //删除
    public List<Cost> getAll();
	public Cost findCostById(Integer id);

}
