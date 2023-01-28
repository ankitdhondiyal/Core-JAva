package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Create_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.System");
		Class.forName(rs.getString("Driver"));
		String url = rs.getString("url");
		String user = rs.getString("user");
		String psw = rs.getString("password");

		Connection con = DriverManager.getConnection(url, user, psw);
		Statement st = con.createStatement();
		// int i = st.executeUpdate("Create table St_marksheet(Id int(10)not null
		// primary key,Roll_no int(10),Email varchar(20),Fname varchar(20),Lname
		// varchar(20),Physics int(10),Chemistry int(10), Maths int (10))");
		// System.out.println(i+"Done");
		 int j = st.executeUpdate("Insert into St_marksheet values(11,1,'sumit@gmail.com','Sumit','Bhargav',90,88,65)");
		// int k = st.executeUpdate("Insert into St_marksheet
		// values(7,107,'gaurav@gmail.com','Gaurav','Tiwari',44,38,75)");
		//int l = st.executeUpdate(	"Insert into St_marksheet values(8,108,'shashank@gmail.com','Shashank','Verma',84,98,75)");
		// int m = st.executeUpdate("Insert into St_marksheet
		// values(5,105,'dhondiyal@gmail.com','Ankit','Dhondiyal',94,98,95)");

		 System.out.println(j+"Sucess");
		// System.out.println(k);
	//	System.out.println(l);
		// System.out.println(m);

		// int i = st.executeUpdate("delete from St_marksheet where Id=8");
		// System.out.println(i);

	}
}
