package in.co.rays.BasicJdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallUserCount {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");

		CallableStatement cs = con.prepareCall("{call getData(?)}");

		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		int i = cs.getInt(1);

		System.out.println(i);

		cs.close();
		con.close();
		
		//for string type
		/*Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");

		CallableStatement cs = con.prepareCall("{call userCount(?)}");

		cs.registerOutParameter(1, Types.VARCHAR);
		cs.execute();
		System.out.println(cs.getString(1));
		*/
	}
}
