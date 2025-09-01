package interfacePack;

public class HDFC implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("RD amount per month : 1000 ");
		System.out.println("Interest rate for RD : "+intrate);
		System.out.println("Duration : 12 months ");
		
		RBI ref = new HDFC();		
		float maturityamount =ref.recurringDeposits(1000f, 12,intrate);
		System.out.println("Last maturity amt:"+maturityamount);
	}

	@Override
	public float recurringDeposits(float p, int dur, float R) {
		// TODO Auto-generated method stub
		
		//M = P*(1+R/N)^Nt
		
		float monthly_amount= p;
		float total= 0f;
		
		for (int i=1;i<=dur;i++) {
			
			float interest_permonth = p*((R/100)/12);
			monthly_amount = monthly_amount+interest_permonth;
			//System.out.println(monthly_amount);
			total = total+monthly_amount;
		}
		
		return total;
	}

}
