class Nested_try_catch_exception
{
    public static void main(String[]args)
    { 
       System.out.println("................Start of the code..................");
       System.out.println(" ");
     // outer try block-1
    try 
       {	    
       // inner try block-2
           try  
           {
               int x=30/0;
	     
           }
	 // if array index found out of bound exception occurs.
           catch(ArrayIndexOutOfBoundsException e)
           {
              System.out.println("Array Index out of bound  Exception occurs");
	    System.out.println(e);
           }
       }    
       // if any kind of arithmetic exception occurs.
       catch(ArithmeticException e)
       {
          System.out.println("Arithmetic Exception occurs");
          System.out.println(e);
       }
         // when not match the exception above catch block , then the exception catch by the default java runtime exception.
       catch(Exception e)
       {
          System.out.println("Common Exception occurs");
       }
       
        // final exception always Executed , if throw of exception catch or not.
       finally 
       {
       System.out.println("Finally exception occurs");
       }
       System.out.println(" ");
       System.out.println("............Rest of the code.............");
       
    }
}
