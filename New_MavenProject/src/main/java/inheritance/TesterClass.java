package inheritance;

public class TesterClass extends EmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TesterClass tc = new TesterClass();
		tc.name = "Ann";
		tc.attendedMeeting();
		tc.testSoftware();
		
		//Parent class calling
		EmployeeClass ec = new EmployeeClass();
		ec.name ="Eve";
		ec.attendedMeeting();
		
	}	
	
	public void testSoftware() {
		System.out.println(name+ " is testing.");
	}

}
