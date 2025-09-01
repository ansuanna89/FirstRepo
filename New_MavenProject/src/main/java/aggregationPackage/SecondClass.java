package aggregationPackage;

public class SecondClass {
	
	int rollnum;
	String subject;
	FirstClass refer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		FirstClass fc = new FirstClass("Ann",42);
		
		SecondClass sc =new SecondClass(101,"Malayalam",fc);
		sc.display();
				
		

	}
	
	public SecondClass(int rollnum, String subject,FirstClass refer ) {
		
		this.rollnum=rollnum;
		this.subject=subject;
		this.refer=refer;
	}
	
	public void display() {
		System.out.println(rollnum);
		System.out.println(subject);
		System.out.println(refer.name);
		System.out.println(refer.mark);
	}

}
