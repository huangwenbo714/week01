package com.huangwenbo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangwenbo.bean.Info;
import com.huangwenbo.bean.Teacher;
import com.huangwenbo.service.InfoService;
//控制层
@Controller
public class InfoController {

	@Autowired
	private InfoService ser;
	
	@RequestMapping("list")
	public String sayList(Model model,@RequestParam(defaultValue="1")Integer pageNum,
			String iname,Integer status,Integer tid){
		
		//初始化分页
		PageHelper.startPage(pageNum, 2);
		//实例化map
		Map<String, Object> map = new HashMap<String, Object>();
		//存储
		map.put("iname", iname);
		map.put("status", status);
		map.put("tid", tid);
		//执行查询
		List<Info> ilist = ser.queryInfo(map);
		//封装分页
		PageInfo<Info> page = new PageInfo<Info>(ilist);
		//存储
		model.addAttribute("page", page);
		model.addAttribute("iname", iname);
		model.addAttribute("status", status);
		//查询所有教师
		List<Teacher> tlist = ser.queryTeacher();
		model.addAttribute("tlist", tlist);
		//页面分发
		return "list";
	}
	//查询所有教师
	@RequestMapping("selectTeacher")
	@ResponseBody
	public List<Teacher> sayTeachers(){
		//执行查询
		List<Teacher> teacher = ser.queryTeacher();
		//页面分发
		return teacher;
	}
	//添加
	@RequestMapping("add")
	public String sayadd(Info i){
		
		//执行添加
		int x = ser.insertInfo(i);
		//判断
		if(x>0){
			//添加成功
			return "redirect:list";
		}else{
			return "add";
		}
	}
	//收被
	@RequestMapping("update")
	@ResponseBody
	public String sayupdate(Integer inid){
		
		//执行
		int updateInfo = ser.updateInfo(inid);
		try {
			//正确
			return "redirect:list";
		} catch (Exception e) {
			// TODO: handle exception
			//错误
			return "redirect:list";
		}
	}
	//查看
	@RequestMapping("show")
	public String sayshow(Integer inid,Model model){
		
		//执行查询
		Info info = ser.showinfo(inid);
		//存储
		model.addAttribute("info", info);
		//查询所有教师
		List<Teacher> tlist = ser.queryTeacher();
		model.addAttribute("tlist", tlist);
		//页面分发
		return "show";
	}
}
