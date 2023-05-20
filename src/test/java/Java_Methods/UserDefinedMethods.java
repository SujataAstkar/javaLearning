package Java_Methods;

public class UserDefinedMethods {
	
	public void test()
	{
		System.out.println("hellow how r u ?");
	}
	
	public String NameOfCountry()
	{
		String country="India";
		return country;
	}
	
	public String[] students()
	{
		String name[]=new String[4];
		name[0]="tom";
		name[1]="sam";
		name[2]="roze";
		name[3]="peter";
		return name;
	}
	public int add (int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		UserDefinedMethods abc=new UserDefinedMethods();
		abc.test();
		String[] A= abc.students();
		for(int k=0;k<A.length;k++)
		{
			System.out.println(A[k]);
		}
		
		
		
		
		
	}
	
	
	
	

}
