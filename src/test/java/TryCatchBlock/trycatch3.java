package TryCatchBlock;

public class trycatch3 {
	public void division(int a,int b)
	{
		try
		{
			int c=a/b;
			System.out.println("division of " + a +" and " +b+ " is :-" +c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("exception is occured on int b");
		}
	}
	public static void main(String[] args)
	{
		trycatch3 tc=new trycatch3();
		tc.division(20, 8);
	}
	

}
