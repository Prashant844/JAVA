import java.io.*;
class M
{
    
        void method() throws IOException
        {
               throw new IOException("Device Error...");
        }
    }

class throw_Custom_exception extends M
{
    public static void main(String[]args)
    { 
       System.out.println("................Start of the code..................");
       System.out.println(" ");
          
       M obj=new M();
       try
       {
           obj.method();       
       }
       catch(Exception e)
       {System.out.println(e);}
       System.out.println(" ");
       System.out.println("............Rest of the code.............");
    }
}
