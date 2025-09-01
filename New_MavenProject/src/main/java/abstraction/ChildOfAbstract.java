package abstraction;

public class ChildOfAbstract extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildOfAbstract ca = new ChildOfAbstract();
		ca.display();
		System.out.println(ca.sum(8, 90));
		ca.diff(8, 2);
		ca.show();
		
		
		
		//using parent class refernce variable
		
		Parent refer = new ChildOfAbstract();
		refer.display();
		int sum = refer.sum(7, 7);
		System.out.println(sum);
		refer.diff(6, 1);
		//refer.show();

		
	}

	@Override
	public void display() {
		
			System.out.println("Inside display");
		
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		
		return a+b;
	}
	
	public void show() {
		System.out.println("Inside Show");
	}

	public ChildOfAbstract()
	{
		super(77,88);
	}
}
