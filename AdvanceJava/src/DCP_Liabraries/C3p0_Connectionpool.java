package DCP_Liabraries;

import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class  C3p0_Connectionpool {

	public static void main(String[] args) throws PropertyVetoException {
		ComboPooledDataSource ds = new ComboPooledDataSource ();

		ds.setDriverClass("com.mysql.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost/marksheet01");
		
		ds.setUser("root");
		ds.setPassword("root");
		
		ds.setInitialPoolSize(5);
		ds.setAcquireIncrement(5);
		
		ds.setMaxAdministrativeTaskTime(50);
		
	}
			


}
