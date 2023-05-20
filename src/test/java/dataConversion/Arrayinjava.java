package dataConversion;

public class Arrayinjava {
	public static void main(String[] args)
	{
		int[] x= new int[4];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		System.out.println(x[0]+x[1]);
		
		//int y[]= new int[3];
		//int []z= new int[3];
		int a[]= {10,20,30,40,50};
		System.out.println(a.length);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		int[] k= {10,20,30,40,50};
		System.out.println(k.length);
		for(int j=0; j<k.length; j++)
		{
			//System.out.println(x[j]);
		
			if(k[j]==20)
			{
			System.out.println("20 is present on index number :" +j);
			}
		}
		System.out.println("------------------------------------------------------");
		
		double[] d= new double[4];
		d[0]=12.20;
	    d[1]=50;
		//d[2]=0;
		d[3]=60.888;
		for(int e=0; e<d.length; e++)
		{
			System.out.println(d[e]);
		}
	
		System.out.println("------------------------------------------------");
		String str[]=new String[4];
		str[0]="s1";
		str[1]="s2";
		str[2]="s3";
		str[3]="s5";
		for(int num=0;num<str.length;num++)
		{
			if(str[num].equals("s1"))
			{
				System.out.println("s1 is present");
				
			}
			else if(str[num].equals("s2"))
			{
				System.out.println("s2 is present");
			}
			else if(str[num].equals("s3"))
			{
				System.out.println("s3 is present");
			}
			else if(str[num].equals("s4"))
			{
				System.out.println("s4 is present");
			}
				
				else 
				{
					System.out.println( "not present");
	            }
				
		   }
			
			Object[] empl1 =new Object[6];
			empl1[0]="tom";
			empl1[1]=1992;
			empl1[2]=true;
			empl1[3]="$250";
			empl1[4]='m';
			empl1[5]=false;
			for(int count=0; count<empl1.length;count++)
			{
				System.out.println(empl1[count]);
			}
			
			
			
			
			
			
			
			
			
			
		}
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


