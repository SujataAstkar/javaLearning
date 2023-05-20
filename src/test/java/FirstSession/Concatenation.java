package FirstSession;

public class Concatenation {
	public static void main(String[] args)
	{  
		//***********************************
		//string concatenation
		//************************************
		
		int a =10;
		int b =20;
		
		String x= "100";
		String y= "200";
		
		String c="sujata";
		String d="Astkar";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(c+d);
		System.out.println(a+b+c+d);
		System.out.println(x+y+c+d);
		System.out.println(c+a+b);
		System.out.println(c+(a+b));
		
		int Bill = 200;
		int Tax=25;
		System.out.println("total amount of food is-"+Bill+Tax);
		System.out.println("total amount of food is-"+(Bill+Tax));
		
//		****************************************
//		character concatenation
//		*****************************************
		char c1= 'A';  String s1="A";
		char c2= 'B';  String s2="B";
	    char c3= '5';  int i1=5;
	    char c4= '6';  int i2=6;
	     
	    System.out.println(c1+c2);
	    System.out.println(c3+c4);
	    System.out.println(s1+s2);
	    System.out.println(i1+i2);
	    System.out.println(s1+s2+(c1+c2));
	    System.out.println(s1+s2+c1+c2);
	    System.out.println(s1+s2+(c3+c4));
	    System.out.println(s1+s2+c3+c4);
	    
		
	}



}
