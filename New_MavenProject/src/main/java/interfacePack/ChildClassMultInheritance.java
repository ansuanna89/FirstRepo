package interfacePack;

public class ChildClassMultInheritance implements InterfaceParent, InterfaceP2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClassMultInheritance ccm = new ChildClassMultInheritance();
		ccm.inter2Disp();
		ccm.display();
		System.out.println(ccm.abMeth(8, 7));
		System.out.println(ccm.z);
		System.out.println(ccm.a);
		
		
		//Always better to create the child class object to access interface methods if we are using multiple interface
		
		//other wise we need to create reference of 2 interface
		
		/*
		InterfaceP2 ref = new ChildClassMultInheritance();
		ref.inter2Disp();
		ref.display();
		System.out.println(ref.z);
		//System.out.println(ref.a);
		//ref.abMeth(1,2);
		
		InterfaceParent refer = new ChildClassMultInheritance();
		//refer.inter2Disp();
		refer.display();
		System.out.println(refer.abMeth(1,2));
		//System.out.println(refer.z);
		System.out.println(refer.a);
		*/
		
		
	}

	@Override
	public void inter2Disp() {
		// TODO Auto-generated method stub
		System.out.println("Inside implemented method of Interface 2");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Both Interface having the same meth");
		
	}

	@Override
	public int abMeth(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Inside implemented meth of Interface 1");
		
		return a+b;
	}

}
