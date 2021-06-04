package logical;

public class Hoisting {

	public static void main(String[] args) {
		john("john");
	}
	static void john(String john)
	{
		System.out.println(john);
	}

}
