package abstraction;

import java.util.*;

public class FullTimeEmployee extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee fte = new FullTimeEmployee();
		double salary = fte.calculateSalary(280.5d, 8);
		System.out.println("Salary Per Month:"+salary);
	}

	@Override
	public double calculateSalary(double paymentperhr, int workingHr) {
		
		double salPerDay = paymentperhr*workingHr;
		System.out.println("Salary Per Day:"+salPerDay);
	    Calendar cal = Calendar.getInstance();
		int num_days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("No of days in current month: " + num_days);
		double salPerMonth = salPerDay*num_days;
	
		return salPerMonth;
	}

}
