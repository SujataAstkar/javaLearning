package FirstSession;

public class ConditionalOperators 
{
	public static void main(String[] args)
	{
		int a=20;
		int b=20;
		if(a>b)
		{ 
			System.out.println("a is greter than b");
		}
		 else if(a==b)
		{
			System.out.println("a and b are equal");
		}
		else
		{ 
			System.out.println("b is greter than a");
		}

	//*********************************************************************************
	   int total= 00;
	   if(!(total==0))
	     {
		  System.out.println("give 10% discount");
	     }
	   else
	    {
		System.out.println("not Eligible for discount");
	    }	
	  //*************************************************************************************** 
	   if(true)
	   {
		   System.out.println("hellloooo");
		   
	   }
	   else
	   {
		   System.out.println("goodbye");
		   }
	   //***********************************************************************************
	   int num=5;
	   if(num>10)
	   {
		  if(num==15)
		  {
			  System.out.println("number is 15");
		  }
		  else if (num==17)
		  {
			  System.out.println("number is 17");
		  }
		  else
		  {
			  System.out.println("number not found");
		  }
		  
	   }
	   
	   else if(num==10)
	   {
		   System.out.println("number is 10");
		   
	   }
	   else
	   { 
		   System.out.println("number is less than 10 number is :"+num);
	   }
	 //***************************************************************************************  
	   
	   int number =44;
	   if (number==10)
	   { 
		   System.out.println("number is 10");
	   }
	   else if(number==20)
	   {
		   System.out.println("number is 20");
       }
	   else if(number==30)
	   {
		   System.out.println("number is 30");
	   }
	   else 
	   {
		   System.out.println("number is not found");
	   }
	   //************************************************************************
	   // && operator
	   int x=200;
	   int y=200;
	   int z=200;
	   if(x>y && x>z)
	   {
		   System.out.println(" lrargest number is  :"+x);
	   }
	   //else if(y>x && y>z)
		   else if(y>z)
	   {
		   System.out.println("largest number is  :"+y);
	   }
		   else
		   {
			 System.out.println("largest number is  :"+z);
			 
		   }
	   
	//************************************************************************
	   //|| operator
	   
	 String user="tom";
	   if(user=="tom" ||user=="rose")
	   {
		   System.out.println("hello programmer  :"+user);
	   }
	   else if(user=="ravi"|| user=="mina")
	   {
		   System.out.println("hello tester   ;"+user);
	   }
	   else
	   {
		   System.out.println("how can i help u  :"+user);
	   }
	   
	   
	   
  }	   
	   
}
		

		
		  
		
		
		
		
		
