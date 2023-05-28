import java.io.*;
import java.util.Scanner;

public class read3 {
    public static void main(String[] args) {

        try {
            
            ////here we create the Scanner class object and File Class object together.
            
            File f = new File("C:/Users/prash/Desktop/New.txt");
            //and passing the file class object to the Scanner class constructor.
            Scanner UserInput = new Scanner(f);
            //through the while loop, read line by line
            while (UserInput.hasNextLine()) {
                //creating a variable input to store the string from the file.
                String input = UserInput.nextLine();
                System.out.println(input + " ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
