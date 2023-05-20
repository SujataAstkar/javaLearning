package Java_Methods;

public class Classes_And_Methods {
	String title="welcome to amazon";
	String url="http://www.amazon.in";
	String logo="www.logo//image.in";
	
	public void TopPannel()
	{
		System.out.println("-----------------Start of Top Pannel-------------------");
		System.out.println("Welcome to amazon");
		System.out.println(title);
		System.out.println(url);
		System.out.println(logo);
		System.out.println("------------------end of Top Pannel--------------------");
	}
	
	public void CenterPannel()
	{
		System.out.println("-------------------Startin of Center Pannel------------");
		System.out.println("mobile");
		System.out.println("camera");
		System.out.println("bags");
		System.out.println("shoes");
		System.out.println("-----------------End of Center Pannel----------------");
		
	}
	public void bottomPanel()
	{
		System.out.println("-----------------Start of bottom Pannel-------------------");
		System.out.println("Visite again to amazon");
		System.out.println(title);
		System.out.println(url);
		System.out.println(logo);
		System.out.println("------------------end of Bottom Pannel--------------------");
	}
	
	public static void privacypolicy() 
	{
		System.out.println("best user");
	}
		
	public static void main(String[] args)
	{
	 Classes_And_Methods abc=new Classes_And_Methods();
	 abc.TopPannel();
	 abc.CenterPannel();
	 abc.bottomPanel();
	 privacypolicy();
	 Classes_And_Methods.privacypolicy();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
