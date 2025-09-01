package accessSpecifierSecondPack;

import accessspecifierPkg.SpecifierSingleClass;

public class SpecifierFirstClassOutsidePack extends SpecifierSingleClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpecifierFirstClassOutsidePack sscop = new SpecifierFirstClassOutsidePack();
		sscop.methodProtected();
		sscop.methodPublic();
		
		SpecifierSingleClass.statPrivateVarAccess(); //parent class
		SpecifierSingleClass.statProtectedMethAccess(); //parent class 
		
		
		SpecifierSingleClass ssc = new SpecifierSingleClass();
		ssc.methodPublic(); // only ublic method accessible through Parent class object
	}

}
