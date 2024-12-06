package corejava;

public class Varbles 
{
	int a=5;
	static int c=7;
	public void var()
	{
		//we can't create static variables inside local space
		//static int z=1;
		int b=3;
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
	}
	public void meth(int x, int y)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
	public void login(String uname, String pwrd)
	{
		System.out.println(uname);
		System.out.println(pwrd);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Varbles v=new Varbles();
		System.out.println(v.a);
		System.out.println(c);
		v.var();
		v.meth(10, 20);
		v.login("manju", "glnm@123");

	}

}
