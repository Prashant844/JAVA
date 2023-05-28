import java.io.*;
public class delete {
    public static void main(String[] args) {
        try
        {
            File f = new File("C:/Users/prash/Desktop/New2.txt");
            if(f.exists())
            {
                f.delete(); // remove the file
                System.out.println("File Path : "+f.getAbsolutePath()); // display the path of the file for once after deletion.
            }
            else
            {
                System.out.println("File not Exists!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
