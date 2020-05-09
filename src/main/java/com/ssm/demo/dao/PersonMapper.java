package com.ssm.demo.dao;


import java.util.List;

import com.ssm.demo.bean.Person;

public interface PersonMapper {
	
    List<Person> selectByPrimaryKey(Long id);
    
}
