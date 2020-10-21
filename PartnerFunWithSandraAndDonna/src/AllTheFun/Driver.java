package AllTheFun;

public class Driver {

	public static void main(String[] args) {
		Student aStudent= new Student("Bob", 95);
		Class myClass = new Class(aStudent, "Fun With Java", 254);
		System.out.println("woo on Donna branch");
		System.out.println(myClass.toString());
	}

}
