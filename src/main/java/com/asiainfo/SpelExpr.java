package com.asiainfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * 文本表达式
 *
 * @author zhangzhiwang
 * @date 2019年3月7日 下午11:16:07
 */
public class SpelExpr {
	public static void main(String[] args) {
		// 文本字符解析
		ExpressionParser expressionParser = new SpelExpressionParser();
//		System.out.println(expressionParser.parseExpression("'hello'").getValue());
//		System.out.println(expressionParser.parseExpression("\"hello\"").getValue());
//		System.out.println(expressionParser.parseExpression("\"1.1\"").getValue());
//		System.out.println(expressionParser.parseExpression("\"true\"").getValue());
//		System.out.println(expressionParser.parseExpression("null").getValue());
		
		//对象属性解析
//		User user = new User();
//		user.setAge(10);
//		user.setName("zzw");
//		user.setCar(new Car("BMW"));
//		
//		ExpressionParser expressionParser = new SpelExpressionParser();
//		EvaluationContext evaluationContext = new StandardEvaluationContext(user);
//		
//		int age = (Integer) expressionParser.parseExpression("age").getValue(evaluationContext);
//		String name = expressionParser.parseExpression("name").getValue(evaluationContext, String.class);
//		String carBrand = expressionParser.parseExpression("car.brand").getValue(evaluationContext, String.class);
//		
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(carBrand);
		
		// 变量
//		User user = new User();
//		EvaluationContext evaluationContext = new StandardEvaluationContext(user);
//		System.out.println(user.getName());
//		evaluationContext.setVariable("name2", "aaa");
//		expressionParser.parseExpression("name=#name2").getValue(evaluationContext);
//		System.out.println(user.getName());
		
		// 集合过滤
		EvaluationContext evaluationContext = new StandardEvaluationContext();
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("a", 1);
//		map.put("b", 2);
//		map.put("c", 3);
//		evaluationContext.setVariable("mapParam", map);
//		Map<String, Integer> resultMap = (Map<String, Integer>) expressionParser.parseExpression("#mapParam.$[value>1]").getValue(evaluationContext);
//		System.out.println(resultMap);
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		evaluationContext.setVariable("listParam", list);
//		List<Integer> resultList = (List<Integer>) expressionParser.parseExpression("#listParam.?[#this>1]").getValue(evaluationContext);

		// 集合转换
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		evaluationContext.setVariable("listParam", list);
//		List<Integer> resultList = (List<Integer>) expressionParser.parseExpression("#listParam.![#this+1]").getValue(evaluationContext);
//		System.out.println(resultList);
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		evaluationContext.setVariable("mapParam", map);
		List<Integer> resultMap = (List<Integer>) expressionParser.parseExpression("#mapParam.![value+1]").getValue(evaluationContext);
		System.out.println(resultMap);
	}
}
