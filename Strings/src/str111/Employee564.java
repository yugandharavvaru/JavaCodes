package str111;

public class Employee564 {
	String s="hello";
	String s1="New Hello";
	


	

	public Employee564(String s, String s1) {
		super();
		this.s = s;
		this.s1 = s1;
	}





	@Override
	public String toString() {
		return "Employee564 [s=" + s + ", s1=" + s1 + "]";
	}

public static void main (String[] args) {
	
	Employee564 e=new Employee564("hello", "hello  world");
	System.out.println(e.toString());
 

}

}
