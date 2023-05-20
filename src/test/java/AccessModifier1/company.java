package AccessModifier1;

public class company {
	private int revenew=500000;
	protected String compCEO="Mr Peter";
	String comname="ABC";
	public int Employeecount=200;
	
	public static void main(String[] args)
	{
		
		company com=new company();
		System.out.println(com.revenew);
		System.out.println(com.compCEO);
		System.out.println(com.comname);
		System.out.println(com.Employeecount);
		
		
	}
	

}
