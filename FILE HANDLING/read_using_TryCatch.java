import java.io.*;

class read {
    public static void main(String[] args) {

        try {
            // file reader class is used to read the data from a file.
            FileReader r = new FileReader("C:/Users/prash/Desktop/New.txt");
            try {
                int i; // create a variable for storing the file data
                // read method return file data in integer format and read the data untill last
                // character.

                while ((i = r.read()) != -1) {
                    System.out.println((char) i); // here we use the typecasting to convert the integer to character.
                }
            } finally {
                r.close();
                System.out.println("File Closed.");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
