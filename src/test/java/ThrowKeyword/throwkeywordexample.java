package ThrowKeyword;

public class throwkeywordexample {
	public static void main(String[] args)
	{
		throwkeywordexample te=new throwkeywordexample();
	te.lounchurl("http.www.exception.in");
		
	}
	
	
	public  void lounchurl(String url) {
		if(url.equals(" "))
		{
			try {
				throw new Exception(" url is blank");
				}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("plz enter url");
			}
		  }
			else
			{
				System.out.println(url);
				
		    }
			
	}

}
