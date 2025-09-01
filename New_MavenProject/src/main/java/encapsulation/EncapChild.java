package encapsulation;

public class EncapChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapParent ep = new EncapParent();
	
			ep.setAge(3);
			System.out.println(ep.getAge());
			
			ep.setName("Eve");
			System.out.println(ep.getName());
	}
	

}
