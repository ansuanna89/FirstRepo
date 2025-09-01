package abstraction;

public class Contractor extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor ct = new Contractor();
		System.out.println("Working hours per day: 5");
		double salary = ct.calculateSalary(250.5d, 5);
		
		System.out.println("Number of working days in the month: 25");
		int totalworkingdays =25;
		double salarypermonth =totalworkingdays*salary;
		System.out.println("Salary Per Month based on contract:"+salarypermonth);

	}

	@Override
	public double calculateSalary(double paymentperhr, int workingHr) {
		// TODO Auto-generated method stub
		
		double salPerDay = paymentperhr*workingHr;
		
		return salPerDay;
	}


}
