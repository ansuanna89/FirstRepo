package inheritance;

public class HireTester extends HireManager{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HireTester ht = new HireTester();
		ht.manageTeam();
		ht.testingReg();
		
	}
	
	public void testingReg() {
		System.out.println("Inside Regression");
	}

	
}
