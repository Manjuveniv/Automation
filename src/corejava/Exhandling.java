package corejava;

public class Exhandling 
{
	public void m1()
	{
	try
	{
		//String s=null;
		//System.out.println(s.length());
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	//catch(Exception e)
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Exhandling ob=new Exhandling();
		ob.m1();

	}
	

}
