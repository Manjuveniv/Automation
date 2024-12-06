package corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ColleDAtaTypes 
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("idiot durga");
		list.add("stupid hemanth");
		list.add("jaanuuu");
		list.add("hasi");
		list.add("dhams");
		System.out.println(list.getFirst());
		System.out.println(list.get(1));
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.hasNext());
		}
		
		
		
	}
}


