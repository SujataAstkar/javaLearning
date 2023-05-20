package dataConversion;

public class WrapperClasses {
	public static void main (String[] args)
	{
		// 1 string to integer conversion
		String x="100";
		System.out.println(x+10);// 10010
		int i= Integer.parseInt(x);//converting string to integer
		System.out.println(i+10);//110
		System.out.println("-------------------------------------------");
		
		//2 integer to string conversion
		int a=10;
		System.out.println(a+5);//15
		String y =String.valueOf(a);
		System.out.println(y+5);//105
		System.out.println("-------------------------------------------");
		
		//String to double conversion
		String z="12.33";
		System.out.println(z+10);//12.3310
		double b=Double.parseDouble(z);
		System.out.println(b+z);
		System.out.println("--------------------------------------------");
		
		//removing foreign carectore while converting string to integer
		String s1="$440";//if we use integer.parseInt() it throw exception
        String s2=s1.replace("$", "");
        int i2 =Integer.parseInt(s2);
        System.out.println(i2+10);
        
        System.out.println("---------------------------------------------");
        String s3="$220/-";
        String s4=s3.substring(1, 4);
        int i3=Integer.parseInt(s4);
        System.out.println(i3+20);
        
        System.out.println("------------------------------------------------");
        String s5="$2,20,20/-";
        String s6=s5.replaceAll("[^0-9]", "");
        int i4=Integer.parseInt(s6);
        System.out.println(i4);
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
