package inheritance;

public class HireDeveloper extends HireManager{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HireDeveloper hd = new HireDeveloper();
		hd.manageTeam();
		hd.writeCode();
		

	}
	
	public void writeCode() {
		System.out.println("Writting code");
	}

}
