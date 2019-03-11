package com.asiainfo;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 文本表达式
 *
 * @author zhangzhiwang
 * @date 2019年3月7日 下午11:16:07
 */
public class LiteralExpr {
	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();
		System.out.println(expressionParser.parseExpression("'hello'").getValue());
		System.out.println(expressionParser.parseExpression("\"hello\"").getValue());
		System.out.println(expressionParser.parseExpression("\"1.1\"").getValue());
		System.out.println(expressionParser.parseExpression("\"true\"").getValue());
		System.out.println(expressionParser.parseExpression("null").getValue());
	}
}
