package com.huangwenbo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huangwenbo.bean.Info;
import com.huangwenbo.bean.Teacher;
import com.huangwenbo.mapper.InfoMapper;
@Service
public class InfoServiceImpl implements InfoService{

	@Autowired
	private InfoMapper iMapper;
	@Override
	public List<Info> queryInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return iMapper.queryInfo(map);
	}
	@Override
	public List<Teacher> queryTeacher() {
		// TODO Auto-generated method stub
		return iMapper.queryTeacher();
	}
	@Override
	public int insertInfo(Info i) {
		// TODO Auto-generated method stub
		return iMapper.insertInfo(i);
	}
	@Override
	public int updateInfo(Integer inid) {
		// TODO Auto-generated method stub
		return iMapper.updateInfo(inid);
	}
	@Override
	public Info showinfo(Integer inid) {
		// TODO Auto-generated method stub
		return iMapper.showinfo(inid);
	}

}
