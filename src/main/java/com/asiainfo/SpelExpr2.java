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
		EvaluationContext evaluationContext = new StandardEvaluationContext(new User());
//		String value = (String) expressionParser.parseExpression("'abc'.substring(1)").getValue();// 调用String的方法
//		Integer value = (Integer) expressionParser.parseExpression("'abc'.indexOf('b')").getValue();// 调用String的方法
//		System.out.println(value);
		
		Object value = expressionParser.parseExpression("met4('zzw','aaa')").getValue(evaluationContext);// 调用实例方法
	}
}
