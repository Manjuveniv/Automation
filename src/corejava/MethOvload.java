package corejava;

public class MethOvload 
{
	public void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	public void m1(int a)
	{
		System.out.println(a);
	}
	public void m1(float a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethOvload ob1=new MethOvload();
		ob1.m1(10,20);
		ob1.m1(10);
		ob1.m1(90f,20d);
	}

}
