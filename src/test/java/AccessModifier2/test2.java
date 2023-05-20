package AccessModifier2;

import AccessModifier1.company;

public class test2 extends company {
	
public String changeceo()
{
	compCEO="mr.tom";
	return compCEO;
}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
		test2 t=new test2();
		System.out.println(t.changeceo());
		System.out.println(t.Employeecount);
		
		
	}
	
	
	

}
