package inheritance;

public class MultiLChild extends MultiLevelInter{
	
	public static void main(String args[]) {
		
		MultiLChild mc = new MultiLChild();
		mc.parentDisplay();
		String ntername = mc.interDisplay();
		System.out.println(ntername);
		mc.childDisplay();
		
		System.out.println(mc.name);
	}
	
	public void childDisplay() {
		System.out.println("Inside Child");
	}

}
