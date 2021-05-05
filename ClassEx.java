package logical;
class John{
	public static String John() {
		System.out.println("john");
		return "john";
	}
	
}

public class ClassEx {

	public static void main(String[] args) {
		John obj = new John();
		
		System.out.println(obj.John());
		
		
	}

}
