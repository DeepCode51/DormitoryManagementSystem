package com.itheima.service.impl;


import com.itheima.dao.CostDao;
import com.itheima.po.Class;
import com.itheima.po.Cost;
import com.itheima.po.PageInfo;
import com.itheima.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户Service接口实现类
 */
@Service("CostService")
@Transactional
public class CostServiceImpl implements CostService {
	// CostDao
	@Autowired
	private CostDao CostDao;


	//分页查询
	@Override
	public PageInfo<Cost> findPageInfo(Integer dormitoryid, Integer pageIndex, Integer pageSize) {
		PageInfo<Cost> pi = new PageInfo<Cost>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		//获取总条数
		Integer totalCount = CostDao.totalCount(dormitoryid);
		if (totalCount>0){
			pi.setTotalCount(totalCount);
			//每一页显示班级信息数
			//currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
		List<Cost> CostList =	CostDao.getCostList(dormitoryid,
				     (pi.getPageIndex()-1)*pi.getPageSize(),pi.getPageSize());
		  pi.setList(CostList);
		}
		return pi;
	}

	@Override
	public List<Cost> getAll(){
		List<Cost> CostList = CostDao.getAll();
		return  CostList;
	}

	@Override
	public int deleteCost(Integer id) {
		return CostDao.deleteCost(id);
	}

	@Override
	public int addCost(Cost cost) {
		return CostDao.addCost(cost);
	}

	@Override
	public Cost findCostById (Integer id){
		Cost c = CostDao.findCostById(id);
		return  c;
	}

	//修改班级信息
	@Override
	public int updateCost(Cost uCost) {
		return CostDao.updateCost(uCost);
	}


	
}
