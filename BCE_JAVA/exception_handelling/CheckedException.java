import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
       }
       catch (FileNotFoundException e) {
           System.out.println("File not found");
        }
    }
}
