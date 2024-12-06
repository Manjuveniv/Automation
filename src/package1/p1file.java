package package1;

public class p1file 
{
	public String s1="anu";
	protected String s2="janu";
	private String s3="janu";
	default String s4="hello";
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		p1file ob=new p1file();
		System.out.println(ob.s1);
		System.out.println(ob.s4);

	}

}
