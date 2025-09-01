package interfacePack;

public class ClassInter implements InterfaceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassInter ip = new ClassInter();		
		ip.display();
		ip.show();
		InterfaceParent.statMeth();
		System.out.println(ip.a);
		
		//using reference
		InterfaceParent refer = new ClassInter();
		refer.display();
		System.out.println(refer.abMeth(5,2));
		
		
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside Display");
	}

	@Override
	public int abMeth(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}



}
