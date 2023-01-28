package in.co.rays.BasicJdbc;

import java.sql.DriverManager;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBUndleSpanish {

	public static void main(String[] args) {

		Locale lc = new Locale("SP", "UK");
		ResourceBundle rc = ResourceBundle.getBundle("in.co.rays.resourcebundle.app", lc);
		System.out.println(rc.getString("abc"));
	}
}
