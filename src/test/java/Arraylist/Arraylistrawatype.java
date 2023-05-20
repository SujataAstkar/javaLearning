package Arraylist;

import java.util.ArrayList;

public class Arraylistrawatype {
	public static void main(String[] args)
	{
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		ar.add("tom");
		ar.add('h');
		System.out.println(ar.size());
		ar.add("roze");
		ar.add(500);
		System.out.println(ar.size());
		System.out.println("---------------print all values of array---------------------");
		for(int i=0;i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("--------------------------------------------------------------");
		ar.remove(2);
		System.out.println(ar.size());
		System.out.println("after removing value of index 2 array is");
		for(int j=0;j<ar.size();j++)
		{
			System.out.println(ar.get(j));
		}
		System.out.println("check value roze is present in array or not?");
		for(int k=0; k<ar.size(); k++)
		{
			if(ar.get(k).equals("roze"))
			{		
				System.out.println("roze is present on index number :" +k);
			}
		}
				
				
				
				
				
				
				
					}
		
		
		
		
		
		
		
		
		
		
		
	}
	


