package corejava;

public class ClassC extends ClassB
{
	public void m3()
	{
		System.out.println("I am Child1 Method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ClassC c=new ClassC();
		c.m3();
		c.m1();
		c.m2();
		
		

	}

}
