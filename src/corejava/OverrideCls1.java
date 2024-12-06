package corejava;

public class OverrideCls1 extends MethOriding
{
	public void m1(float a,float b)
	{
		System.out.println(a-b);
	}
	public void m1(double a,float b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OverrideCls1 ob=new OverrideCls1();
		ob.m1(10, 20);
		ob.m1(10f, 20f);
		ob.m1(10d, 20f);
		
		

	}

}
