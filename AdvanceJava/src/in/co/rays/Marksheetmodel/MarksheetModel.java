package in.co.rays.Marksheetmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import in.co.rays.Bean.MarksheetBean;

public class MarksheetModel {

	public void add(MarksheetBean bean) throws ClassNotFoundException, SQLException {

		ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.resourcebundle.System");
		Class.forName(rd.getString("Driver"));

		String user = rd.getString("user");
		String psw = rd.getString("password");
		String url = rd.getString("url");

		Connection con = DriverManager.getConnection(url, user, psw);
		PreparedStatement ps = con.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, bean.getroll_no());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		ps.setInt(7, bean.getTotal());
		ps.setInt(8, bean.getPercentage());
		ps.setString(9, bean.getStatus());

		int i = ps.executeUpdate();

		
	}
//For update into marksheet
	public void update(MarksheetBean bean) throws ClassNotFoundException, SQLException {
		ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.resourcebundle.System");
		Class.forName(rd.getString("Driver"));

		String user = rd.getString("user");
		String psw = rd.getString("password");
		String url = rd.getString("url");

		Connection con = DriverManager.getConnection(url, user, psw);
		PreparedStatement ps = con.prepareStatement("update marksheet set fname='Amit' where roll_no=?");
		ps.setInt(1, bean.getroll_no());
		int i = ps.executeUpdate();

	}
// for Delete into marksheet
	
	public void delete(MarksheetBean bean) throws ClassNotFoundException, SQLException {

		ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.resourcebundle.System");
		Class.forName(rd.getString("Driver"));
		String user = rd.getString("user");
		String psw = rd.getString("password");
		String url = rd.getString("url");

		Connection con = DriverManager.getConnection(url, user, psw);

		PreparedStatement ps = con.prepareStatement("delete from marksheet where roll_no =?");
		ps.setInt(1, bean.getroll_no());
		int i = ps.executeUpdate();

	}

}
