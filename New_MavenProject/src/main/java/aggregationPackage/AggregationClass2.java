package aggregationPackage;

public class AggregationClass2 {
	
	String VType; 
	String color;
	
	AgClass1 reference;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgClass1 ag1 = new AgClass1("CRETA", "KL35K7942");
		
		AggregationClass2 ag2 = new AggregationClass2("SUV","Black",ag1);
		
		ag2.display();
		
	}
	
	public AggregationClass2(String VType , String color, AgClass1 obj) {
		
		this.color=color;
		this.VType=VType;
		reference = obj;
		
	}
	
	public void display() {
		System.out.println(reference.vehicle);
		System.out.println(reference.number);
		System.out.println(color);
		System.out.println(VType);
	}

}
