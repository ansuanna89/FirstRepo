package inheritance;

public class MultiLevelInter extends MultiLevelParent{
	
	String name = "Eve";
	
	public String interDisplay() {
		
		System.out.println("Inside Intermediate");
		return name;
	}

}
