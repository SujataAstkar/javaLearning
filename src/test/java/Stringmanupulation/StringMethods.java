package Stringmanupulation;

public class StringMethods {
	public static void main(String[] args)
	{
		String str1 = "hii i am sujata ritesh astkar";
		System.out.println("length of string str1 is :" +str1.length());
		int str1len=str1.length();
		int total=10+str1len;
		System.out.println("Total is :" +total);
		
		System.out.println("--------------------------------------------------------");
		String str2 = "i am Learning java and testing";
		System.out.println("length of str2 is :"+str2.length());
		System.out.println("charector at index posision 3 is :" +str2.charAt(3));
		System.out.println(str2.charAt(0));
		System.out.println(str2.charAt(1));
		System.out.println(str2.charAt(2));
		System.out.println(str2.charAt(3));
		System.out.println(str2.charAt(4));
		System.out.println(str2.charAt(5));
		int addOfString=str1.length()+str2.length();
		System.out.println("addition of length of str1 and str2 is :" +addOfString);
		char char1=str2.charAt(3);
		System.out.println(char1);
		
		System.out.println("--------------------------------------------------------");
		String str3="i got my dream job feeling happy";
		//what is index number of 'y'
		int indexno=str3.indexOf('y');
		System.out.println("index number of charector y is :" +indexno);
		System.out.println(str3.indexOf('g'));
		System.out.println(str3.length());
		//write code if we want index number of character for second time occurrence
		System.out.println("index number of char 'o' for second time is :" +str3.indexOf('o',4));
		System.out.println(str3.indexOf('o',4));
		
		//print second time index number when we dont know first time index number
		int IndexNoOf=str3.indexOf('o');
		System.out.println("index number of 'o' for secomd time is " +str3.indexOf('o',IndexNoOf+1));
		
		System.out.println("---------------------------------------------------------");
		String str4="my son name is parth astkar";
		System.out.println("index number of word son is :"+str4.indexOf("son"));
		int son= str4.indexOf("son");
		System.out.println("index number of word son is :"+son);
		
		System.out.println("-------------------------------------------------------------");
		String str5 ="i am using window 11 and i have laptop of hp company";
		System.out.println(str5.toUpperCase());
		
		System.out.println("---------------------------------------------------------");
		String str6="I AM LEARNING JAVA FROM VISION IT";
		String lowercase=str6.toLowerCase();
		System.out.println(lowercase);
		String str7="        hiiii how r u      ";
		System.out.println(str7.trim());
		
		System.out.println("------------------------------------------------------------");
		System.out.println("avaibility of word vision in string 6 :" +str6.contains("vision"));
	    System.out.println("avaibility of word vision in string 6  :" +str6.contains("VISION"));
	    
	    System.out.println("------------------------------------------------------------------");
	    String str8="id of customer is= A12342abc ";
	    System.out.println("customer id is "+str8.substring(19));
	    
	    System.out.println("-------------------------------------------------------------");
	    String str10="customer id is : abc1233@ thank you";
	    String id=str10.substring(19, 26);
	    System.out.println(id);
	    
	    
         System.out.println("---------------------------------------------------------------");
	    String statement1="I am learning java";
	    String statement2="i am learning java";
	    String statement3="i am learning java";
	    System.out.println("statement 1 and 2 are equal ? :" +statement1.equals(statement2));
	    System.out.println("statement 1 and 2 are equal ? :" +statement2.equals(statement3));
	    System.out.println("statement 1 and 2 are equal ? :" +statement1.equalsIgnoreCase(statement3));
	    
	    System.out.println("----------------------------------------------------------------");
	    String str11="in am feeling happy and fresh";
	    String[] word=str11.split(" ");
	    for(int i=0; i<word.length; i++)
	    {
	    System.out.println(word[i]);
	    }
	    System.out.println("------------------------------------------------------------------");
	    String str12= "hello gyus whatsup";
	    String rev[]=str12.split(" ");
	    System.out.println(rev[2]+" "+rev[1]+" "+rev[0]);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}
