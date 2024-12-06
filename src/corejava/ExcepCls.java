package corejava;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExcepCls 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//FileInputStream fis=new FileInputStream("C:\\Users\\kiosk_user\\Desktop\\samex\\pr1.txt");
		FileReader fr=new FileReader("C:\\Users\\kiosk_user\\Desktop\\samex\\pr1.txt");
		int i=0;
		//[i=fis.read();
		//System.out.println((char)i);
		//fis.close();]
		
		//while((i=fis.read())!=-1)
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	

}
