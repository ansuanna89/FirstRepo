package accessspecifierPkg;

public class SpecifierInsidePackOutClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecifierSingleClass ssc = new SpecifierSingleClass();
		ssc.methodDefault();
		ssc.methodProtected();
		ssc.methodPublic();
		//ssc.methodPrivate(); -- private method is not available outside the class
		SpecifierSingleClass.statPrivateVarAccess();
		
		//we can access the parent class method using child class object also 
	}

}
