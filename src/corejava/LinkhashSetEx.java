package corejava;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkhashSetEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> i=new LinkedHashSet<Integer>();
		i.add(10);
		i.add(null);
		i.add(10);
		i.add(868);
		i.add(0);
		i.add(90);
		System.out.println(i.containsAll(i));
		System.out.println(i.isEmpty());
		System.out.println(i);

	}

}
