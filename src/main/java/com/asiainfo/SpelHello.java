package com.asiainfo;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpelHello {
	public static void main(String[] args) {
//		ExpressionParser expressionParser = new SpelExpressionParser();
////		Expression parseExpression = expressionParser.parseExpression("'hello ' + 'world!'");
//		Expression parseExpression = expressionParser.parseExpression("'hello '.concat('world').concat('!')");
//		String value  = (String) parseExpression.getValue();
//		System.out.println(value);
		
		User user  = new User();
		user.setName("aaa");
		
		ExpressionParser expressionParser = new SpelExpressionParser();
		EvaluationContext evaluationContext = new StandardEvaluationContext(user);
		String name = (String) expressionParser.parseExpression("name").getValue(evaluationContext);
		System.out.println(name);
	}
}
