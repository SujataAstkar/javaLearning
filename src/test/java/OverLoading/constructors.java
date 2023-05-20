package OverLoading;

public class constructors {
	String name;
	int age;
	String dep;
	int id;
	public constructors() {
		System.out.println("constructor with 0 parametrs");
	}
	public constructors(String name) 
	{
		System.out.println("constructor with 1 parametrs");
	}
	public constructors(String name,int age,String dep,int id)
	{
		this.name=name;
	    this.age=age;
	    this.dep=dep;
	    this.id=id;
	
	}
	public void company()
	{
		System.out.println("conpany name is TCS ");
	}
	
	public static void main(String[] args)
	{
		constructors e0=new constructors();
		constructors e1=new constructors("priya",24,"ts",123);
		constructors e2=new constructors("tom",30,"qa",124);
	    constructors e3=new constructors("peter",26,"hr",125);
		constructors e4=new constructors("rose",28,"se",126);
		constructors e5=new constructors("abc");
	
		System.out.println("      Info of Employee is    ");
		System.out.println(e1.name+" "+e1.age+" "+e1.dep+" "+e1.id);
		System.out.println(e2.name+" "+e2.age+" "+e2.dep+" "+e2.id);
		System.out.println(e3.name+" "+e3.age+" "+e3.dep+" "+e3.id);
		System.out.println(e4.name+" "+e4.age+" "+e4.dep+" "+e4.id);
		
		
		
	}
	
	
	
	
	
	

}
