package com.huangwenbo.mapper;

import java.util.List;
import java.util.Map;

import com.huangwenbo.bean.Info;
import com.huangwenbo.bean.Teacher;

public interface InfoMapper {
	//查询
	public List<Info> queryInfo(Map<String, Object> map);
	//查询所有教师
	public List<Teacher> queryTeacher();
	//添加
	public int insertInfo(Info i);
	//收被
	public int updateInfo(Integer inid);
	//查看
	public Info showinfo(Integer inid);
}
