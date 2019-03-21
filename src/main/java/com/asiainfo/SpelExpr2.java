package com.asiainfo;

import java.util.List;
import java.util.Map;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpelExpr2 {
	public static void main(String[] args) {
		// 数组集合类型解析
		ExpressionParser expressionParser = new SpelExpressionParser();
//		Expression parseExpression = expressionParser.parseExpression("new int[]{1,2,3}");// 解析数组
//		int[] value = (int[]) parseExpression.getValue();
//		System.out.println(value[2]);
		
//		List value = (List) expressionParser.parseExpression("{'a','b'}").getValue();// 解析集合
//		System.out.println(value.get(1));
//		List<List> value = (List<List>) expressionParser.parseExpression("{{1,2},{3,4}}").getValue();
//		System.out.println(value.get(1).get(0));
		
//		Map<String, Object> value = (Map<String, Object>) expressionParser.parseExpression("{name:'zzw', age:29}").getValue();// 解析Map
//		System.out.println(value.get("name"));
//		List<Map<String, Integer>> value = (List<Map<String, Integer>>) expressionParser.parseExpression("{{name:'aaa', age:1},{name:'bbb', age:2}}").getValue();
//		System.out.println(value.get(0).get("name"));
		
//		EvaluationContext evaluationContext = new StandardEvaluationContext(new User());
//		Map<String, Object> value = (Map<String, Object>) expressionParser.parseExpression("list[0]").getValue(evaluationContext);
//		System.out.println(value.get("age"));
		
		// 方法解析
//		EvaluationContext evaluationContext = new StandardEvaluationContext(new User());
//		String value = (String) expressionParser.parseExpression("'abc'.substring(1)").getValue();// 调用String的方法
//		Integer value = (Integer) expressionParser.parseExpression("'abc'.indexOf('b')").getValue();// 调用String的方法
//		System.out.println(value);
		
//		Object value = expressionParser.parseExpression("met4('zzw','aaa')").getValue(evaluationContext);// 调用实例方法
		
		// 操作符解析
//		Boolean value1 = expressionParser.parseExpression("1 == 1").getValue(Boolean.class);
//		Boolean value2 = expressionParser.parseExpression("1 < 0").getValue(Boolean.class);
//		Boolean value3 = expressionParser.parseExpression("'black' < 'block'").getValue(Boolean.class);
//		Boolean value4 = expressionParser.parseExpression("'123' instanceof T(String)").getValue(Boolean.class);
//		Boolean value5 = expressionParser.parseExpression("'123' matches '^-?\\d+$'").getValue(Boolean.class);
//		System.out.println(value1);
//		System.out.println(value2);
//		System.out.println(value3);
//		System.out.println(value4);
//		System.out.println(value5);
//		System.out.println("---------------");
//		
//		Boolean value6 = expressionParser.parseExpression("true && false").getValue(Boolean.class);
//		Boolean value7 = expressionParser.parseExpression("1==1 and 2==3").getValue(Boolean.class);
//		Boolean value8 = expressionParser.parseExpression("true or flase").getValue(Boolean.class);
//		Boolean value9 = expressionParser.parseExpression("1==1 or 2==3").getValue(Boolean.class);
//		System.out.println(value6);
//		System.out.println(value7);
//		System.out.println(value8);
//		System.out.println(value9);
//		System.out.println("---------------");
//		
//		Integer value10 = expressionParser.parseExpression("1+1").getValue(Integer.class);
//		String value11 = expressionParser.parseExpression("'hello' + 'world'").getValue(String.class);
//		Integer value12 = expressionParser.parseExpression("1-(-3)").getValue(Integer.class);
//		Integer value13 = expressionParser.parseExpression("1*2*3").getValue(Integer.class);
//		Integer value14 = expressionParser.parseExpression("10/2/5").getValue(Integer.class);
//		Integer value15 = expressionParser.parseExpression("10%3").getValue(Integer.class);
//		Integer value16 = expressionParser.parseExpression("2^3").getValue(Integer.class);
//		Integer value17 = expressionParser.parseExpression("1+2-3*8").getValue(Integer.class);
//		System.out.println(value10);
//		System.out.println(value11);
//		System.out.println(value12);
//		System.out.println(value13);
//		System.out.println(value14);
//		System.out.println(value15);
//		System.out.println(value16);
//		System.out.println(value17);
//		System.out.println("---------------");
//		
//		User user = new User();
//		EvaluationContext evaluationContext = new StandardEvaluationContext(user);
//		String value18 = expressionParser.parseExpression("user?.name").getValue(evaluationContext, String.class);
//		System.out.println(value18);
//		User u = new User();
//		u.setName("aaa");
//		user.setUser(u);
//		value18 = expressionParser.parseExpression("user?.name").getValue(evaluationContext, String.class);
//		System.out.println(value18);
//		System.out.println("---------------");
//		
//		String value19 = expressionParser.parseExpression("1==1?'aaa':'bbb'").getValue(String.class);
//		System.out.println(value19);
//		System.out.println("---------------");
//		
//		String value20 = expressionParser.parseExpression("'aaa'?:'default'").getValue(String.class);
//		System.out.println(value20);
//		System.out.println("---------------");
		
		// 赋值
//		User user = new User();
//		EvaluationContext evaluationContext = new StandardEvaluationContext(user);
//		expressionParser.parseExpression("name").setValue(evaluationContext, "zzw");
//		System.out.println(user.getName());
//		
//		expressionParser.parseExpression("name = 'abc'").getValue(evaluationContext);
//		System.out.println(user.getName());
		
		// 类型
//		Class value = expressionParser.parseExpression("T(String)").getValue(Class.class);
//		System.out.println(value == java.lang.String.class);
//		Class value2 = expressionParser.parseExpression("T(com.asiainfo.User)").getValue(Class.class);
//		System.out.println(value2 == com.asiainfo.User.class);
//		expressionParser.parseExpression("T(com.asiainfo.User).met3('mmm')").getValue(Class.class);
		
		// 构造器
//		User value = expressionParser.parseExpression("new com.asiainfo.User('sss',30)").getValue(User.class);
//		System.out.println(value);
		
		// 变量
		User user = new User("ppp", 1);
		EvaluationContext evaluationContext = new StandardEvaluationContext(user);
		expressionParser.parseExpression("addr=").getValue(String.class);
		System.out.println(user.getName());
	}
}
