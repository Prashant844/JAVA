class exception_handle_using_nestedtry
{
    public static void main(String[]args)
    {
       System.out.println("..........Start of the code...........");
       System.out.println(" ");
       
       // Note : Try Block not work alone , It should either be a catch or a final block.
       //try blocl-1
       
        try{
	        
        // inner try block-2
          try
          {
            int x=10/0;
	  System.out.println("Value of the X is =" +x);
          }
          // catch block-1
          catch(Exception e)
          {
		System.out.println("Commom Exception Occur");
		
		// this below message print the exception type (which type of error occurs).
                    System.out.println(e);
          }
	
        }
        // the finally block always executed , exception catch or not.
        finally
	{
		System.out.println("This is the finally Block ");
	}
        System.out.println(" ");
        System.out.println("..........Rest of the code...........");
    }
}
