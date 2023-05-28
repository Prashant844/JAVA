import java.io.*;
import java.util.Scanner;

public class read3 {
    public static void main(String[] args) {

        try {
            File f = new File("C:/Users/prash/Desktop/New.txt");
            Scanner UserInput = new Scanner(f);
            while (UserInput.hasNextLine()) {
                String input = UserInput.nextLine();
                System.out.println(input + " ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
