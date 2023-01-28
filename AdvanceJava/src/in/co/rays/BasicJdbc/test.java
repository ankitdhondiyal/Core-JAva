package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	//	add();
		call();
	}

	public static void add() throws ClassNotFoundException, SQLException {
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.System");

		Class.forName(rs.getString("Driver"));
		String url = rs.getString("url");
		String user = rs.getString("user");
		String psw = rs.getString("password");

		Connection con = DriverManager.getConnection(url, user, psw);

		Statement st = con.createStatement();

		int j = st.executeUpdate(
				"insert into st_marksheet values(12,111,'gitikta@gmail.com','Gitika','Saxena',78,98,57)");
		System.out.println(j + "done");
	}

	public static void call()throws ClassNotFoundException, SQLException {

		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.System");

		Class.forName(rs.getString("Driver"));
		String url = rs.getString("url");
		String user = rs.getString("user");
		String psw = rs.getString("password");

		Connection con = DriverManager.getConnection(url, user, psw);

		PreparedStatement ps = con.prepareStatement("select fname from st_marksheet ");

		ResultSet r = ps.executeQuery();

		while(r.next()) {	
		System.out.println(r.getString(1));
	System.out.println(r.getInt(2));
		System.out.println(r.getString(3));
		System.out.println(r.getString(4));
		System.out.println(r.getString(5));
		System.out.println(r.getInt(6));
		System.out.println(r.getInt(7));
		System.out.println(r.getInt(8));
		
		
		}
		r.close();
	}
}
