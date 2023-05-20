package ThrowKeyword;

public class example {
	
	public void lounchbrowser()
	{
		System.out.println("lounchbrowser....");
		lounchurl();
		}
	public void lounchurl() 
	{
		System.out.println("lounchurl......");
		login();
	}
	public void login()
	{
		System.out.println("login");
		try {
			int a=9/3;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("enter right input");
		}
		
		
		
	}


public static void main(String[] args) 
{
example tk=new example();
	tk.lounchbrowser();
	
}	
	


}
