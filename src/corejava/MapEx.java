package corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map m=new HashMap();
		m.put(0,"hh");
		m.put(1,1);
		m.put(2,10);
		m.put(3,868);
		m.put(1,0);
		m.put(4,90);
		m.put(5,null);
		Set set=m.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
		System.out.println(m.containsKey(m));
		System.out.println(m.isEmpty());
		System.out.println(m);
	}

}
