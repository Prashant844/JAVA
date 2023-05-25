import java.io.*;
class file_handle_Using_TryCatch
{
    public static void main(String[] args) {
        File f = new File("C:/Users/prash/Desktop/New.txt");
        try {
            if(f.createNewFile())
            {
                System.out.println("New File Create Successfullly...");
            }
            else
            {
                System.out.println("File Already Exists!");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
