package ThrowKeyword;

public class throwexeption {
	public void lounchbrowser() throws Exception
	{
		System.out.println("lounchbrowser....");
		lounchurl();
		}
	public void lounchurl() throws Exception
	{
		System.out.println("lounchurl......");
		login();
	}
	public void login()throws Exception
	{
		System.out.println("login");
		int a=9/0;
	}


public static void main(String[] args) throws Exception
{
	throwexeption tk=new throwexeption();
	tk.lounchbrowser();
	
	
	
}
}