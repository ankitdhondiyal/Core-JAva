package in.co.rays.BasicJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ExampleCollable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");
		
		CallableStatement cs = con.prepareCall("{call demo(?,?)}");
		
		cs.setInt(1,2);
		cs.registerOutParameter(2,Types.VARCHAR);
	System.out.println("Hi");
	
	cs.execute();
	
	String name = cs.getString(2);
	System.out.println(name);
	System.out.println("Hi");
	}
}
