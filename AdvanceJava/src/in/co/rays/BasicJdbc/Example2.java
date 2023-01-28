package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");

		Statement stmt = con.createStatement();

		// add new detail into table

		int i = stmt.executeUpdate("insert into marksheet values(13,'Rohan','sharma',70,52,54,400,55,'pass',20) ");
		System.out.println(i + "data inserted");

		// for update any detail into table

		// int i =stmt.executeUpdate("update marksheet set fname ='bhuwan' where
		// fname='Rohan'");
		// System.out.println(i +"data inserted");

		// delete any column
//		int i = stmt.executeUpdate("delete from marksheet where fname ='bhuwan'");
		// System.out.println(i + "data deleted");

		// drop column

		// int i = stmt.executeUpdate("alter table marksheet drop column final");
		// System.out.println(i+"Column deleted");

		con.close();
		stmt.close();
	}
}
