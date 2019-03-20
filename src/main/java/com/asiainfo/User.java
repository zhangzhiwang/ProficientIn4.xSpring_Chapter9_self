package com.asiainfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
	private String name;
	private int age;
	private Car car;
	private List<Map<String, Object>> list;
	private User user;

	public User() {
		list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "a");
		map.put("age", 1);
		list.add(map);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void met1(String name) {
		System.out.println("hello1 " + name);
	}

	private void met2(String name) {
		System.out.println("hello2 " + name);
	}

	public static void met3(String name) {
		System.out.println("hello3 " + name);
	}

	public void met4(String... args) {
		System.out.println("args.length=" + args.length);
	}

}
