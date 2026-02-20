import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class CheckedException1 {

    static void readFile(String fileName) {

        try {
            File f = new File(fileName);

            // if file does NOT exist → throw checked exception
            if (!f.exists()) {
                throw new IOException("File does not exist");
            }

            // if file exists
            System.out.println("File exists, ready to read");

       }
       catch (IOException e) {
          System.out.println("IOException handled using try-catch");
          //  System.out.println("Reason: " + e.getMessage());
          //  System.out.println("Reason: " + e.toString());
          //  System.out.println("Reason: " + e.fillInStackTrace());
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        readFile(fileName);

        sc.close();
    }
}
