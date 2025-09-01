package polymorphismPackage;

public class OffSeason extends Onseason{

	String season;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OffSeason off = new OffSeason();
		float amt =1000f;
		double dis = off.customerDiscount(amt, "OFF");
		System.out.println("Customer Discount for the bill amount : "+amt+" is :"+dis);

		
	}
	public double customerDiscount(float amount,String seas) {
		
		double discount = 0;
		
		if(seas.equals("ON")) {
			discount =(super.customerDiscount(amount, seas));
		}
		else {
			
			System.out.println(amount);			
			 discount = (15/100);
			System.out.println(15/100);
			
		}
		return discount;
		
	}

}
