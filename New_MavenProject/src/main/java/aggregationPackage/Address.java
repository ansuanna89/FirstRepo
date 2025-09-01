package aggregationPackage;

public class Address {
	
	String address;
	Student refer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s= new Student("Ann", 101);
		Address a =new Address("Kwarner",s);
		a.display();

	}
	
	public Address(String address,Student refer) {
		this.refer=refer;
		this.address=address;
	}
	
	public void display() {

		System.out.println(refer.sname);
		System.out.println(refer.rollnum);
		System.out.println(address);
	}

}
