import java.io.*;
import java.util.Scanner;

public class read4 {
    public static void main(String[] args) throws IOException {

                File f = new File("C:/Users/prash/Desktop/New.txt");
                Scanner UserInput = new Scanner(f);
                while (UserInput.hasNextLine()) {
                    String input = UserInput.nextLine();
                    System.out.println(input + " ");
                }
    }
}
