package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Load MySQl database driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Create connection using database url and credentials

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");

		// Execute Query

		Statement stmt = con.createStatement();

		// process result

		int i = stmt.executeUpdate("insert into marksheet values(15,'Suman','Tiwari',50,80,70,200,73,'pass')");
		System.out.println(i + " data inserted");

		// close connection
		stmt.close();
		con.close();

	}
}
