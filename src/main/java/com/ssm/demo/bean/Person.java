package com.ssm.demo.bean;

public class Person {
	private long id;
	private String name;
	private String sex;
	private int age;
	public Person()
	{
	}
	public Person(long id, String name, String sex, int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
//重写toString方法，方便打印出属性的值
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
