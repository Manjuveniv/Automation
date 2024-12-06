package corejava;

public class ConstructorEx 
{
	int i;
	String s;
	ConstructorEx()
	{
		System.out.println("I am constructor");
		System.out.println(s+" I am constructor "+i);
	}
	
	
	public void m1()
	{
		System.out.println("I am not constructor method u should call me while executing");
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConstructorEx c=new ConstructorEx();
		c.m1();

	}

}
