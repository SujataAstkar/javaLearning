package TryCatchBlock;

public class trycatch1 {
	public static void main (String[] args)
	{
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		try {
		int a =9/0;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception occured t integer a");
			
			
		}
		System.out.println("D");
		System.out.println("F");
		System.out.println("G");
		
	
}
}