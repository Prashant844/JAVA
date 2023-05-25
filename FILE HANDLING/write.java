import java.io.*;

class write {
    public static void main(String[] args) throws IOException {
        //fileWrite is used to write the data in the existing file.
        //if file is exists, then only write
        //otherwise file will be created and then write the data in it.

        //here we create the object of the fileWrite class.
        FileWriter f = new FileWriter("C:/Users/prash/Desktop/New.txt");

        try {
            try {
                //here we calling the method 'write()' for writting the file.
                f.write("Welcome in the Java Programming...");
            } finally {
        //creating a necessary block to close the file after normal execution of the program
                f.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
