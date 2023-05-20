package Inheritance;

public class Testcar {
	
	public static void main(String[] args)
	{
		System.out.println("child class reference with child class object");
		BMW b=new BMW();
	     b.start();
	     b.stop();
	     b.fillfuel();
	     b.Engine();
	     b.autoparking();
	     BMW.honk();
	
	    System.out.println("parent class reference with parent class object");
	    car c=new car();
	    c.Engine();
	    c.start();
	    c.stop();
	    c.fillfuel();
	    //c.autoparking(); 
	     BMW.honk();
	     car.honk();
	     
	    System.out.println("parent class referrence with child class object");
	    car c1=new BMW();
	    c1.start();
	    c1.stop();
	    c1.fillfuel();
	    c1.Engine();
	    c1.honk();//car.honk();
	    
	    Vehicle v1=new BMW();
	    v1.Engine();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
