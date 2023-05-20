package TryCatchBlock;

public class trycatch2 {
	public void division(int a,int b)
	{
		int c=a/b;
		System.out.println("division of " + a +" and " +b+ " is :-" +c);
	}
	
	
	public static void main(String[] args)
	{
		trycatch2 tc=new trycatch2();
		 try
		 {
			 tc.division(10, 0);
		 }
		 catch(Exception e)
		 {
			e.printStackTrace();
			
		 }
	}

}
