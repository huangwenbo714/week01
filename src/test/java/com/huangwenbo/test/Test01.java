package com.huangwenbo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huangwenbo.bean.Info;
import com.huangwenbo.mapper.InfoMapper;

//测试类
public class Test01 {
	// 测试添加
	@Test
	public void test02() {
		// application
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取bean
		InfoMapper bean = app.getBean(InfoMapper.class);

		Info i = new Info();
		i.setIname("123");
		// 测试
		int x = bean.insertInfo(i);
		// 判断
		if (x > 0) {
			System.out.println("insert ok");
		} else {
			System.out.println("insert no");
		}
	}

	// 测试查看
	@Test
	public void test03() {
		// application
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取bean
		InfoMapper bean = app.getBean(InfoMapper.class);

		Integer inid = 2;
		// 测试
		Info showinfo = bean.showinfo(inid);
		// 输出
		System.out.println(showinfo);
	}

	// 测试收被
	@Test
	public void test04() {
		// application
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取bean
		InfoMapper bean = app.getBean(InfoMapper.class);
		
		Integer inid = 2;
		//测试
		int x = bean.updateInfo(inid);
		if(x>0){
			System.out.println("ok");
		}else{
			System.out.println("on");
		}
	}
}
