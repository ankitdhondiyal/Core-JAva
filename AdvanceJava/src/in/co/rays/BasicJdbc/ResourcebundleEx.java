package in.co.rays.BasicJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ResourcebundleEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.resourcebundle.System");
	Class.forName(rs.getString("Driver"));
	String url = rs.getString("url");
	String user =rs.getString("user");
	String pass = rs.getString("password");
	
	Connection con = DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
	
	int i = st.executeUpdate("insert into marksheet values (16,'Sakshi','Raghuvanshi',15,45,78,57,78,'pass')");
	
	System.out.println(i+"Done");
	
	con.close();
	
	
	
	
	
	}
}
