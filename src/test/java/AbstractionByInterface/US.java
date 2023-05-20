package AbstractionByInterface;

public interface US extends WHO {
	public void aa();
	public void bb();
	public void cc();
	
    int a=10;
    
   public static void helth()
   {
    	System.out.println("helth");
   }
    
    default void internship()
    {
    	System.out.println("internship");
    }
    
    
    
}
