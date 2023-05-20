package OverLoading;

public class employeeid {
	String name;
	int age;
	String dep;
	int id;
	public static void main(String[] args) {
		employeeid e1=new employeeid();
		e1.name="kavita";
		e1.age=22;
		e1.dep="qa";
		e1.id=123;
		
		System.out.println("information of employee 1 is-  ");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.dep);
		System.out.println(e1.id);
		
		employeeid e2=new employeeid();
		e2.name="priyanka";
		e2.age=30;
		e2.dep="sd";
		e2.id=222;
		
		System.out.println("information of employee 2 is-  ");
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.dep);
		System.out.println(e2.id);
		
		
		
		
		
	}

}
