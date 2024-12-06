package corejava;

import java.util.Stack;

public class StackEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> i=new Stack<Integer>();
		i.add(10);
		i.add(6);
		i.add(9);
		i.elementAt(0);
		i.push(100);
		i.push(66);
		i.pop();
		i.peek();
		i.isEmpty();
		System.out.println(i);
		System.out.println(i.peek());
		System.out.println(i.isEmpty());
		

	}

}
