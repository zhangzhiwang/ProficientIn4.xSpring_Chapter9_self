package com.asiainfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
	private String name;
	private List<Map<String, Object>> list;
	
	public User() {
		list = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String, Object>();
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

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
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
