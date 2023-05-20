package Arraylist;

import java.util.ArrayList;

public class ArrayListObjectType {
	public static void main(String[] args)
	{
		ArrayList<Object> emp1=new ArrayList<Object>();
		
		emp1.add(100);
		emp1.add("tom");
		emp1.add(true);
		emp1.add("123@");
		emp1.add(200.50);
		System.out.println("size of arraylist  :"+emp1.size());
		for(int i=0; i<emp1.size();i++)
		{
			System.out.println(emp1.get(i));
		}
		
		emp1.clear();
		System.out.println(emp1.size());
		
		emp1.add("roze");
		emp1.add(200);
		
		System.out.println(emp1.size());
		
		
		
		 
		
		
		
		
		
	}

}
