package in.co.rays.BasicJdbc;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleHindi {
	public static void main(String[] args) {
		
		
		Locale loc = new Locale("hi","IN","MP"); 
	ResourceBundle rs =ResourceBundle.getBundle("in.co.rays.resourcebundle.app",loc);
	
	System.out.println(rs.getString("str"));
	}

}
