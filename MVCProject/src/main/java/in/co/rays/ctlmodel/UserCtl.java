package in.co.rays.ctlmodel;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.model.UserModel;
import in.co.rays.userbean.UserBean;

/**
 * Servlet implementation class UserCtl
 */
@WebServlet(urlPatterns = {"/userctl"})
public class UserCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserCtl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String name = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String psw = request.getParameter("psw");
//		String date=request.getParameter("Date");

		UserBean b = new UserBean();
		UserModel um = new UserModel();

//		SimpleDateFormat sdf = new SimpleDateFormat();
		
//		String str=sdf.format("dd/mm/yyyy");
//		System.out.println(str);
	
//		b.setName(name);
//		b.setLname(lname);
//		b.setEmail(email);
//		b.setPassword(psw);
//		
//		System.out.println(b.getName());
		
/*		try {
		um.add(b);	//ADD
		RequestDispatcher rd=request.getRequestDispatcher("Loginuser.jsp");
		rd.forward(request, response);
		System.out.println("Data inserted");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	*/
		
		String op=request.getParameter("Operation");
		System.out.println(op);

	try {
		if(op.equals("Insert")){
		b.setName(name);
		b.setLname(lname);
		b.setEmail(email);
		b.setPassword(psw);
		
		um.add(b); // ADD
		
	RequestDispatcher rd= request.getRequestDispatcher("Loginuser.jsp");	
	rd.forward(request, response);
	System.out.println(b.getName());
		System.out.println("Data inserted Sucessfully");
		
		}else if (op.equals("Delete")) {
			b.setName(name);
			System.out.println(b.getName());
			um.delete(b); // Delete
			
	RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");
			rd.forward(request, response);
			System.out.println("Data deleted");
			
		}else if (op.contentEquals("Update")) {
			b.setName(name);
			b.setLname(lname);
			
			um.update(b);// Update
			
			RequestDispatcher rd= request.getRequestDispatcher("Loginuser.jsp");	
			request.setAttribute("OK", "Data Updated Sucessfully");
			
			rd.forward(request, response);
				System.out.println(b.getName()+" Data Updated Sucessfully");
		}
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
		
	}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		
		UserBean b = new UserBean();
		UserModel model = new UserModel();
		b.setEmail(email);
		b.setPassword(pwd);
		
		try {
			UserBean bean1= model.auth(email, pwd);
			if (bean1!=null) {
				RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
				rd.forward(request, response);
			}else {
				request.setAttribute("errr", "Mail id doesn't exist");
				RequestDispatcher rd=request.getRequestDispatcher("Loginuser.jsp");
				rd.forward(request, response);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
	

}
