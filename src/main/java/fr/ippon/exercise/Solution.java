/*
This code will be the code editable by the candidate.
 */
package fr.ippon.exercise;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

public class Solution {
	
	public int compute(String expression) {

		Stack<Integer> pile = new Stack();
		parseExpression(expression)
				.forEach(element -> processElement(pile, element));

		return pile.pop();
	}

	private void processOperator(Stack<Integer> pile, String operator) {
		int v1 = pile.pop();
		int v2 = pile.pop();
		switch (operator) {
			case "+":
				pile.push(v1 + v2);
				break;
			case "-":
				pile.push(v2 - v1);
				break;
			case "*":
				pile.push(v2 * v1);
				break;
			default:
				break;
		}
	}

	private Stream<String> parseExpression(String expression) {
		return Arrays.stream(expression.split(" "));
	}

	private void processElement(Stack<Integer> pile, String element) {
		if ("+-*".contains(element)) {
			processOperator(pile, element);
		} else {
			pile.push(Integer.parseInt(element));
		}
	}
}
