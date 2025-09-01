package encapsulation;

public class User extends Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		u.setPin(1001);
		int pin = u.getPin();
		Boolean isvalid = u.checkValidPin(pin);
		
		if(isvalid == true) {
			System.out.println("Pin is valid: "+pin);
		}
		else {
			System.out.println("Pin is not valid: "+pin);
		}
	}
	
	public boolean checkValidPin(int p) {
		boolean flag = false;
		
		switch(p) {
		case 1001 : flag=true;
					break;
		case 1234 : flag=true;
					break;
		case 1212 : flag=true;
					break;
		default	  : flag = false;
					break;
					
		}
		
		return flag;
	}

}
