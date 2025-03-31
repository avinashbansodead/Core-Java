package interview.coding;

import java.util.Stack;

public class StackTest
{
	public static void main(String[] args)
	{
		Stack<Character> stack = new Stack<>();
		for (int i=0 ; i<1 ;i++)
		{
		stack.push(')');
		}
		System.out.println(stack);
		System.out.println(stack.isEmpty());
	}
}
