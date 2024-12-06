package corejava;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrt 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String path="C:\\Users\\kiosk_user\\Desktop\\samex\\pr1.txt";
		FileWriter fw=new FileWriter("C:\\Users\\kiosk_user\\Desktop\\samex\\pr1.txt");
		fw.write("Hi");
		fw.close();

	}

}
