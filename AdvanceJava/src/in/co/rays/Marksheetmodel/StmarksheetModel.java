package in.co.rays.Marksheetmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import in.co.rays.Bean.StmarksheetBean;

public class StmarksheetModel {

	public Integer nextPK() throws ClassNotFoundException, SQLException {

		ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.bundle.System");
		Class.forName(rd.getString("Driver"));
		String user = rd.getString("user");
		String psw = rd.getString("password");
		String url = rd.getString("url");

		Connection con = DriverManager.getConnection(url, user, psw);

		int pk = 0;

		try {
			PreparedStatement ps = con.prepareStatement("select max(Id) from st_marksheet");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return pk + 1;

	}

	public void add(StmarksheetBean bean) throws ClassNotFoundException, SQLException {

		ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.bundle.System");
		Class.forName(rd.getString("Driver"));
		String user = rd.getString("user");
		String psw = rd.getString("password");
		String url = rd.getString("url");

		Connection con = DriverManager.getConnection(url, user, psw);
		try {
			PreparedStatement ps = con.prepareStatement("insert into st_marksheet values(?,?,?,?,?,?,?,?)");

			ps.setInt(1, nextPK());
			ps.setInt(2, bean.getRoll_no());
			ps.setString(3, bean.getEmail());
			ps.setString(4, bean.getFname());
			ps.setString(5, bean.getLname());
			ps.setInt(6, bean.getPhysics());
			ps.setInt(7, bean.getChemistry());
			ps.setInt(8, bean.getMaths());

			int i = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static ArrayList meritList() throws SQLException, ClassNotFoundException {
		
		ArrayList list = new ArrayList();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement ps = con.prepareStatement("select *from st_marksheet");
		ResultSet rs = ps.executeQuery();
		StmarksheetBean mb = null;
		while (rs.next()) {
			mb = new StmarksheetBean();
			mb.setId(rs.getInt(1));
			mb.setRoll_no(rs.getInt(2));
			mb.setEmail(rs.getString(3));
			mb.setFname(rs.getString(4));
			mb.setLname(rs.getString(5));
			mb.setPhysics(rs.getInt(6));
			mb.setChemistry(rs.getInt(7));
			mb.setMaths(rs.getInt(8));
			list.add(mb);
	}
			return list;
	}
	public void update(StmarksheetBean b)throws ClassNotFoundException, SQLException {
		
		ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.bundle.System");
		Class.forName(rd.getString("Driver"));
		String user= rd.getString("user");
		String pass=rd.getString("password");
		String url =rd.getString("url");
		
		Connection con =DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = con.prepareStatement("update st_marksheet set Email= 'gaurav12@gmail.com' where roll_no=?");
		
		ps.setInt(1, b.getRoll_no());
		int i = ps.executeUpdate();
	}
	
/*	public void delete(StmarksheetBean b) throws ClassNotFoundException, SQLException {
		

		ResourceBundle rd = ResourceBundle.getBundle("in.co.rays.bundle.System");
		Class.forName(rd.getString("Driver"));
		String user= rd.getString("user");
		String pass=rd.getString("password");
		String url =rd.getString("url");
		
		Connection con =DriverManager.getConnection(url,user,pass);
		
		PreparedStatement ps = con.prepareStatement("delete from st_marksheet where roll_no=?");
		ps.setInt(1, b.getRoll_no());
		ps.executeUpdate();
	} */
}
