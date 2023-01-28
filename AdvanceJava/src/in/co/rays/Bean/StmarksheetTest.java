package in.co.rays.Bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import in.co.rays.Marksheetmodel.StmarksheetModel;

public class StmarksheetTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//testInsert();
	   //testMeritList();
		//updatemarksheet();
		Testdelete();
		
		
	}

	//testInsert();
	public static void testInsert() {

		StmarksheetBean bean = new StmarksheetBean();
		StmarksheetModel md = new StmarksheetModel();

		bean.setRoll_no(110);
		bean.setEmail("sona@gmail.com");
		bean.setFname("gaurav");
		bean.setLname("Mehra");
		bean.setPhysics(57);
		bean.setChemistry(98);
		bean.setMaths(85);

		try {
			md.add(bean);
			System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	   //testMeritList();
	
	public static void testMeritList() throws ClassNotFoundException, SQLException {
		StmarksheetBean bean = new StmarksheetBean();
		StmarksheetModel md = new StmarksheetModel();
		
	ArrayList list = new ArrayList();
	list = md.meritList();
	Iterator it = list.iterator();
	
	while (it.hasNext()) {
		bean = (StmarksheetBean) it.next();
		
		System.out.print(bean.getId()+"\t");
		System.out.print(bean.getRoll_no()+"\t");
	    System.out.print(bean.getEmail()+"\t");
	    System.out.print(bean.getFname()+"\t");
	    System.out.print(bean.getLname()+"\t");	
	    System.out.print(bean.getPhysics()+"\t");
		System.out.print(bean.getChemistry()+"\t");
		System.out.println(bean.getMaths());
	}
	}
	
	//updatemarksheet();

	public static void updatemarksheet() {

		StmarksheetBean bean = new StmarksheetBean();
		StmarksheetModel md = new StmarksheetModel();
		
		bean.setRoll_no(110);
				
		try {
		md.update(bean);
		System.out.println("Data updated");
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}	
	}
	
	//		Testdelete();

	public static void Testdelete() {

		StmarksheetBean bean = new StmarksheetBean();
		StmarksheetModel md = new StmarksheetModel();
	
		bean.setRoll_no(111);
		try {
			md.delete(bean);
			System.out.println("Deleted");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
