package Java_Methods;

import java.util.ArrayList;

public class SystemMethods {
	static String str= "         hiii i am tom          ";
	public static void main(String[] args)
	{
		System.out.println(str);
		System.out.println("length of string str is :" +str.length());
		System.out.println("-------------------------------------------");
		System.out.println(str.trim());
		System.out.println(str.length());
		System.out.println("-------------------------------------------");
		ArrayList<Integer> muloften =new ArrayList<Integer>();
		muloften.add(10);
		muloften.add(20);
		muloften.add(20);
		muloften.add(30);
		muloften.add(40);
		System.out.println(muloften.size());
		muloften.remove(1);
		for(int i=0;i<muloften.size();i++)
		{
			System.out.println(muloften.get(i));
		}
		System.out.println("--------------------------------------------");
		System.out.println(muloften.size());
		
		
		
		
	}
	
	

}
