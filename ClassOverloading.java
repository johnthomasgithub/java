package logical;

class A{

	public void john()
    {
    	System.out.println("inside no parameter");
    }
}

class B extends A{
	@Override
	public void john()
	{
		super.john();
		System.out.println("inside Overriden method");
	}
	
}
public class ClassOverloading {

	public static void main(String[] args) {
		A obj = new A();
		obj.john();
	}

}
