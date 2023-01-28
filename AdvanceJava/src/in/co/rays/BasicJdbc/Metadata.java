package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Metadata {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");

			PreparedStatement ps = cn.prepareStatement("select *from marksheet");

			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rcm = rs.getMetaData();
			DatabaseMetaData dbm = cn.getMetaData();

			System.out.println("Total no of columns" + rcm.getColumnCount());
			System.out.println("column name");
			System.out.println();
			System.out.println(rcm.getColumnName(1));
			System.out.println(rcm.getColumnName(3));
			System.out.println(rcm.getColumnName(5));
			System.out.println(rcm.getColumnName(7));
			System.out.println(rcm.getColumnName(9));
			System.out.println(rcm.getColumnTypeName(1));
			System.out.println(rcm.getColumnTypeName(3));
			System.out.println();

			System.out.println("driver name" + dbm.getDriverName());
			System.out.println("User name" + dbm.getUserName());
			System.out.println("data base product name " + dbm.getDatabaseProductName());
			System.out.println("version " + dbm.getDatabaseProductVersion());

			cn.close();
			rs.close();
			ps.close();

		} catch (Exception w) {

		}
	}
}
