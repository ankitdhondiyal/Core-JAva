package DCP_Liabraries;

import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DcpExample {

	public static void getInstanced() throws PropertyVetoException {
	ComboPooledDataSource ds = new ComboPooledDataSource ();

	ds.setDriverClass("com.mysql.cj.jdbc.Driver");
	ds.setJdbcUrl("jdbc:mysql://localhost:3306/marksheet01");
	
	ds.setUser("root");
	ds.setPassword("root");
	
	ds.setInitialPoolSize(5);
	ds.setAcquireIncrement(5);
	
	//ds.setMaxAdministrativeTaskTime(50);
	ds.setMaxPoolSize(50);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
			

	}


