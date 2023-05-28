import java.io.*;

class read2 {
    // declaring the IOException with the main method signature for avoiding the use
    // of try catch block.
    public static void main(String[] args) throws IOException {

        FileReader r = new FileReader("C:/Users/prash/Desktop/New.txt");

        int i;
        while ((i = r.read()) != -1) {
            System.out.println((char) i);
        }
        r.close();
        System.out.println("File Closed.");
    }
}
