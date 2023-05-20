package ThrowKeyword;

public class finallyblock {
	public int getnumber()
	{
		int a=20;
		int b=0;
		 try {
			 System.out.println(" two numbers are "+a +" "+b);
			 int c=a/b;
			 return c;
			 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 return -1;
			 
		 }
		 finally
		 {
			 System.out.println("process completedd");
			 return 100;
		 }
	}
	
	public static void main(String[] args)
	{
		finallyblock fb=new finallyblock();
		int x=fb.getnumber();
		System.out.println(x);
	}

}
