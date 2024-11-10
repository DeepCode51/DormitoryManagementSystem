package com.itheima.controller;

import com.itheima.po.PageInfo;
import com.itheima.po.Student;
import com.itheima.po.Class;
import com.itheima.po.Cost;
import com.itheima.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.servlet.http.HttpSession;

/**
 * @program: dormitorySystem
 * @description: 水电费管理
 * @author: Joyrocky
 * @create: 2019-05-14 12:37
 **/
@Controller
public class CostController {
    //依赖注入
    @Autowired
    private CostService costService;
    /**
     * 分页查询
     * pageIndex 当前页码
     * pageSize  显示条数
     */
    @RequestMapping(value = "/findCost")
    public String findCost(Integer dormitoryid,  Integer pageIndex,
                              Integer pageSize, Model model) {

        PageInfo<Cost> pi = costService.findPageInfo(dormitoryid,
                                                pageIndex,pageSize);
        model.addAttribute("pi",pi);
        model.addAttribute("dormitoryid",dormitoryid);
        return "cost_list";
    }

    /**
     * 导出Excel
     */
    @RequestMapping(value = "/exportCostlist", method = RequestMethod.POST)
    @ResponseBody
    public List<Cost> exportCost(){
        List<Cost> costList = costService.getAll();
        return costList;
    }

    /**
     * 添加信息
     */

    @RequestMapping(value = "/addCost" ,method = RequestMethod.POST)
    @ResponseBody
    public String addStudent(@RequestBody Cost cost) {
        int v = costService.addCost(cost);
        return "cost_list";
    }
    
    
    @RequestMapping( "/deleteCost")
	@ResponseBody
	public String deleteCost(Integer id) {
		int c = costService.deleteCost(id);
		return "cost_list";
	}
    
    @RequestMapping(value = "/updateCost" ,method = RequestMethod.POST)
	public String updateCost( Cost cost) {
    	cost.setSumprice(cost.getWaterprice()+cost.getElectricityprice());
		int c = costService.updateCost(cost);
		return "redirect:/findCost";
	}
    
    @RequestMapping( "/findCostById")
    public String findCostById(Integer id,HttpSession session) {

        Cost s= costService.findCostById(id);
        session.setAttribute("s",s);
        return "cost_edit";
    }
}

