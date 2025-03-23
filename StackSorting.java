package practice_prgm;

import java.util.Stack;

public class StackSorting {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(34);
		stack.push(3);
		stack.push(31);
		stack.push(98);
		stack.push(92);
		stack.push(23);
		Stack<Integer> result = stackSorting(stack);
		while(!result.isEmpty()) {
			System.out.println(result.pop());
		}
	}
	
	private static Stack<Integer> stackSorting(Stack<Integer> input) {
		Stack<Integer> temp = new Stack<>();
		while(!input.isEmpty()) {
			int k = input.pop();
			while(!temp.isEmpty() && temp.peek() < k) {
				input.push(temp.pop());
			}
			temp.push(k);
		}
		return temp;
	}

}
