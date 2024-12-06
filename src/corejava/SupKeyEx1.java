package corejava;

public class SupKeyEx1 extends SuperKeyEx
{
	String clr="black";
	public void m1()
	{
		System.out.println(clr);
		System.out.println(super.clr);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		SupKeyEx1 ob=new SupKeyEx1();
		ob.m1();
		
	}

}
