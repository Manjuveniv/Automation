package corejava;

import java.util.HashSet;

public class HashSetEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(10);
		h.add(null);
		h.add(10);
		h.add(868);
		h.add(0);
		h.add(90);
		System.out.println(h.containsAll(h));
		System.out.println(h.isEmpty());
		System.out.println(h);
		

	}

}
