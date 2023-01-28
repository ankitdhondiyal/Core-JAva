package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet01", "root", "root");

		try {

			cn.setAutoCommit(false);
			Statement st = cn.createStatement();
			String s1 = "insert into marksheet values(13,'Aniket','Mishra',10,10,10,30,27,'fail')";
			String s2 = "update marksheet set fname ='Nikita' where roll_no =8";
			String s3 = "insert into marksheet values(14,'geet','tiwari',50,50,50,50,37,'pass')";

			int i = st.executeUpdate(s1);
			i = st.executeUpdate(s2);
			i = st.executeUpdate(s3);

			System.out.println("Sucess");
			cn.commit();
		} catch (SQLException e) {
 
			cn.rollback();
			System.out.println("Oops Transaction fail");
		}

	}
}
