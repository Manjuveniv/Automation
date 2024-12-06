package corejava;

public class Strpro1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1="manju";
		String s2="ve luru ";
		System.out.println(s1.equals(s2));
		System.out.println(s2.substring(3));
		String s3=s2.join("hiii");
		System.out.println(s3); 
		System.out.println(s2.substring(1,3));
		System.out.println(s2.concat(s1));
		String[] a=s1.split(" ");
		for(String b : a)
		{
	
			System.out.println(b);
		}
		
		

	}

}
