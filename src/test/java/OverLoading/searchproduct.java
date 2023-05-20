package OverLoading;

public class searchproduct {
	public void product(String name)
	{
		System.out.println("product nmae is"+name);
		
	}
	public void product(String name,int price)
	{
		System.out.println("product name and price is :"+name+" " +price);
	}
	public void product(String nmae,int price ,String seller)
	{
		System.out.println("product name price and seller is :"+nmae+ " ," +price+","+seller);
	}
	public void payment(int ccnumber)
	{
		System .out.println("payment by ccnumber");
	}
	public void payment(int ccnumber,int pin)
	{
		System .out.println("payment by ccnumber and pin");
	}
	public void payment(int ccnumber,long pin,String cardholder)
	{
		System .out.println("payment by ccnumbe , pin and cardholder name");
	}
	public static void main(String[] args)
	{
		searchproduct sp=new searchproduct();
		searchproduct pay=new searchproduct();
		sp.product("mobile");
		sp.product("mobile",15000);
		sp.product("mobile", 15000, "nsamsun");
		pay.payment(123);
		pay.payment(123, 123);
		pay.payment(222, 333, "xyz");
		
	}
	
	
	
	
 
}
