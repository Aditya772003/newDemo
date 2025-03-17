package inheritancetest;

public class Employeetest {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1);
		e.setName("Enter Name");
		e.setMobno("Enter Mobno");
		e.setAddress("Enter Address");
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getMobno());
		System.out.println(e.getaddress());
		
	}

}
