package corejava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testcase1 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream reader=new FileInputStream("C:\\Users\\kiosk_user\\eclipse-workspace\\corejava\\Configuration");
		prop.load(reader);
		String username=prop.getProperty("username");
		System.out.println(username);
		String password=prop.getProperty("password");
		System.out.println(password);
		String environment=prop.getProperty("environment");
		System.out.println(environment);
		
		

	}

}
