package in.co.rays.BasicJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Executebatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");

		CallableStatement cs = con.prepareCall("{call demo(?,?)}");
		
		cs.setInt(1,1);
		cs.addBatch();
		cs.setInt(1,3);
		cs.addBatch();
		//cs.setInt(1, 3);
		
		int[] updateCounts = cs.executeBatch();
		for(int i:updateCounts)
		{
			
		
		System.out.println(i+"sucess");}
	
	}
}
