package OverLoading;

public class LogintoAplication {
	
	public void login()
	{
		System.out.println("login with no parameter");
	}
	public void login(int OTP)
	{
		System.out.println("login with OTP and OTP Is:" +OTP);
	}
	public void login(String username,String Password)
	{
		System.out.println("login with usrename and password");
	}

	public void login(long phnnumber,String Password)
	{
		System.out.println("login with phone number and password  :" +phnnumber +" " +Password);
		
	}
	public void login(long phnnumber,String Password,int otp)
	{
		System.out.println("login with phone number and password  :"+phnnumber +" "+otp);
		
	}
	public static void main(String[] args)
	{
		LogintoAplication lp =new LogintoAplication();
		lp.login();
		lp.login(123);
		lp.login(1234567890, "sujata");
		lp.login("sujata", "parth");
		lp.login(33333, "ritesh", 12234);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
