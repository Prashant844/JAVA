import java.io.*;

class create {
    public static void main(String[] args) throws IOException {
        File f = new File("C:/Users/prash/Desktop/New.txt");

        if (f.createNewFile()) {
            System.out.println("New File Create Successfullly...");
        } else {
            System.out.println("File Already Exists!");
        }
    }
}
