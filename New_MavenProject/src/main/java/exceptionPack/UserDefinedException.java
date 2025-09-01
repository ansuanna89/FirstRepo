package exceptionPack;

public class UserDefinedException {

	public static void main(String[] args) throws CandidateNotEligible {
		// TODO Auto-generated method stub
		int age=15;
		
		if(age>=18) {
			System.out.println("Eligible for votting");
			
		}
		else {
			throw new CandidateNotEligible("Candidate is not eligible for votting");
		}
	}

}
