package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import in.co.rays.userbean.UserBean;

public class UserModel {

	public int nextPK() throws ClassNotFoundException, SQLException {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Bundle.Systemm");
		Class.forName(rb.getString("Driver"));
		String url = rb.getString("url");
		String user = rb.getString("user");
		String psw = rb.getString("password");

		Connection con = DriverManager.getConnection(url, user, psw);

		int pk = 0;

		PreparedStatement ps = con.prepareStatement("select max(id) from user");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}

		ps.close();
		rs.close();
		con.close();
		return pk + 1;

	}

	public void add(UserBean Bean) throws ClassNotFoundException, SQLException {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Bundle.Systemm");
		Class.forName(rb.getString("Driver"));
		String url = rb.getString("url");
		String user = rb.getString("user");
		String psw = rb.getString("password");

		Connection con = DriverManager.getConnection(url, user, psw);

	try {
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");
	

		UserModel m = new UserModel();

		ps.setInt(1, m.nextPK());
		ps.setString(2, Bean.getName());
		ps.setString(3, Bean.getLname());
		ps.setString(4, Bean.getEmail());
		ps.setString(5, Bean.getPassword());
		
		int i = ps.executeUpdate();
	}catch(SQLException e) {
		System.out.println("hello");
		System.out.println("hi");
		System.out.println(e.getMessage());
	}	
	}
	public UserBean auth(String login,String pass) throws ClassNotFoundException, SQLException {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Bundle.Systemm");
		Class.forName(rb.getString("Driver"));
		String url = rb.getString("url");
		String user = rb.getString("user");
		String psw = rb.getString("password");

		Connection con = DriverManager.getConnection(url, user, psw);
		StringBuffer sql = new StringBuffer("SELECT * FROM USER WHERE EMAIL=? and password=?");
		UserBean bean = null;

		try {
			
			PreparedStatement ps = con.prepareStatement(sql.toString());
			ps.setString(1, login);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				bean = new UserBean();
				
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setLname(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setPassword(rs.getString(5));			}
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
	}
		return bean;
	}
	public static ArrayList getList() throws ClassNotFoundException, SQLException {
		
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Bundle.Systemm");
		Class.forName(rb.getString("Driver"));
		String url = rb.getString("url");
		String user = rb.getString("user");
		String psw = rb.getString("password");
		
		Connection con = DriverManager.getConnection(url, user, psw);

		PreparedStatement ps = con.prepareStatement("select * from user");
		
		ArrayList list = new ArrayList<UserBean>();
		
			ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			UserBean bean = new UserBean();
			
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setPassword(rs.getString(5));
list.add(bean)	;
		}
		return list;

	}
	public void delete(UserBean bean) throws ClassNotFoundException, SQLException {
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.Bundle.Systemm");
		Class.forName(rs.getString("Driver"));
		String url = rs.getString("url");
		String user = rs.getString("user");
		String pass = rs.getString("password");
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = con.prepareStatement("delete from user where firstName = ?");
		ps.setString(1, bean.getName());
		int i = ps.executeUpdate();
	}
	public void update(UserBean bean) throws ClassNotFoundException, SQLException {
		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.Bundle.Systemm");
		Class.forName(rs.getString("Driver"));
		String url = rs.getString("url");
		String user = rs.getString("user");
		String pass = rs.getString("password");
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement ps = con.prepareStatement("update user set FirstName = ? where LastName = ?");
		ps.setString(1, bean.getName());
		ps.setString(2, bean.getLname());
		int i = ps.executeUpdate();
	}
}
