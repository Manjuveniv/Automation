package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://localhost:3306/sampledatabase";
		String username="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create connection to the database
		Connection con=DriverManager.getConnection(dbURL, username, password);
		//create the statement object
		Statement st=con.createStatement();
		
		String selectquery="select * from Stud";
		//result set is used to execute the query
		ResultSet rs=st.executeQuery(selectquery);
		while(rs.next())
		{
			System.out.println(rs.getString("sname"));
			System.out.println(rs.getString("sid"));
			
		}
	}

}
