package logical;

class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class Encap {

	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(12);
		
		s.setName("Tom");
		System.out.println(s.getName());

	}

}
