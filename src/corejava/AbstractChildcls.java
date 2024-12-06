package corejava;

public class AbstractChildcls extends AbstrClass
{
	

	

	@Override
	void m1() 
	{
		// TODO Auto-generated method stub
		System.out.println("I am m1 method in child cls");
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractChildcls ob=new AbstractChildcls();
		ob.m1();
		ob.m2();

	}

}
