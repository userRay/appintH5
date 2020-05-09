package com.ssm.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.demo.bean.Person;
import com.ssm.demo.dao.PersonMapper;

@Controller
public class DemoController {

			@Autowired
			private PersonMapper personMapper;
			@RequestMapping(value="a")//设置访问controller的路径
			public void test()
			{
				List<Person> personList = personMapper.selectByPrimaryKey(23359827L);//通过主键去查询数据库
				
				for(Person p : personList)
				{
					System.out.println(p.toString());//遍历输出查询到的结果
				}
			}


}
