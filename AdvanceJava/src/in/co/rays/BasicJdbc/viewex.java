package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class viewex {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");
		PreparedStatement stmt = con.prepareStatement("select * from marksheet");

		ResultSet rs = stmt.executeQuery();
		System.out.println("roll_no" + " " + "fname" + " " + "lname" + " " + "physiscs" + " " + "chemistry" + " "
				+ " maths" + " " + "total" + " " + "percentage" + " " + "status" + "  ");
		
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getInt(4) + "\t");
			System.out.print(rs.getInt(5) + "\t");
			System.out.print(rs.getInt(6) + "\t");
			System.out.print(rs.getInt(7) + "\t");
			System.out.print(rs.getInt(8) + "\t");
			System.out.println(rs.getString(9));

		}
		rs.close();
		con.close();

	}
}
