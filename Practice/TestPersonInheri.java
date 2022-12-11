package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPersonInheri {

	public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Businessman b= new Businessman();
		Doctor d= new Doctor ();
		Strudent s= new Strudent();
		
		PersonInheri P = new Businessman();
		
		
	b.setName("Ankit");
	b.setAddress("Bhopal");
	b.setDateOfBirth(sdf.parse("27/6/2022"));
	b.setIncome(1000.00);
	
	//Doctor
	
	d.setName("Doctor");
	d.setAddress("Sehore");
	d.setDateOfBirth(sdf.parse("18/8/2022") );
	d.setRegisNo("15");
	
	// Student
	s.setName("Student");
	s.setAddress("Uttarakhand");
	s.setDateOfBirth(sdf.parse("16/7/2022") );
	s.setRollno("20");
	s.setMarks(98);
	
	System.out.println(b.getName());
	System.out.println(b.getAddress());
	System.out.println(b.getDateOfBirth());
	System.out.println(b.getIncome());
	
	System.out.println(d.getName());
	System.out.println(d.getAddress());
	System.out.println(d.getDateOfBirth());
	System.out.println(d.getRegisNo());
	
	System.out.println(s.getName());
	System.out.println(s.getAddress());
	System.out.println(s.getDateOfBirth());
	System.out.println(s.getRollno());
	System.out.println(s.getMarks());
	
	
	}
}
