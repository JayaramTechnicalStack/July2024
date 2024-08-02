package hasa;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address a1 = new Address();
		a1.setFlatNo("C201");
		a1.setAddressLine1("abc Laylout");
		a1.setAddressLine2("2nd cross");
		a1.setLandMark("near busstop");
		a1.setCity("bangalore");
		a1.setPicode(560066);
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Ajay");
		s1.setMarks(85);
		s1.setAddress(a1);
		
		System.out.println(s1);
		
		//System.out.println(s1.getId() + "  "+s1.getMarks() +"   " +s1.getName() + "   "+s1.getAddress());
		
	}

}
