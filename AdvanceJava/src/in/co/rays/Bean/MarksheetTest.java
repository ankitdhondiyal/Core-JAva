package in.co.rays.Bean;

import in.co.rays.Marksheetmodel.MarksheetModel;

public class MarksheetTest {

	public static void main(String[] args) {

		//testAdd();
		//testUpdate();
		testdelete();
	}

	public static void testAdd() {

		MarksheetBean bean = new MarksheetBean();
		MarksheetModel md = new MarksheetModel();
		bean.setroll_no(18);
		bean.setFname("Ketan");
		bean.setLname("parikh");
		bean.setPhysics(45);
		bean.setChemistry(84);
		bean.setMaths(84);
		bean.setTotal(152);
		bean.setPercentage(84);
		bean.setStatus("Pass");

		try {
			//MarksheetBean b = new MarksheetBean();
			 md.add(bean);
		
				System.out.println("Success");
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void testUpdate() {
		MarksheetBean b = new MarksheetBean();
		MarksheetModel m = new MarksheetModel();
		b.setroll_no(15);
		try {
			m.update(b);
			System.out.println("your data successfully updated");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void testdelete() {
		
		MarksheetBean b = new MarksheetBean();
		MarksheetModel mm = new MarksheetModel();
		b.setroll_no(10);
		
		try {
			mm.delete(b);
			System.out.println("Data deleted ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
