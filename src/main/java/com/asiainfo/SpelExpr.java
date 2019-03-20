package com.asiainfo;

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
//		ExpressionParser expressionParser = new SpelExpressionParser();
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
		
		// 数组、集合类型解析
		
		
		
		
		
		
		
		
		
		
	}
}
