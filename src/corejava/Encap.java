package corejava;

public class Encap 
{
	String name;
	int id;
	public void getname()
	{
		System.out.println(name);
	}
	public void getid()
	{
		System.out.println(id);
	}
	public void setname(String s)
	{
		this.name=s;
	}
	public void setid(int n)
	{
		this.id=n;
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Encap ob=new Encap();
		ob.setname("manju");
		ob.setid(11);
		ob.getname();
		ob.getid();
		
		
		
	}

}
