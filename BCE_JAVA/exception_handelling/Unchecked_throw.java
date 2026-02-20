import java.util.Scanner;
public class Unchecked_throw {

        static void checkAge(int age) {
           try{
               if (age < 18)
                   throw new IllegalArgumentException("Age must be 18 or above");
               System.out.println("Hello, welcome to voter group");
          } catch (IllegalArgumentException e) {
              System.out.println(" Age must be 18 or above");
              throw new RuntimeException(e);
          }
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int x= sc.nextInt();
            checkAge(x);
            int y= sc.nextInt();
            checkAge(y);

        }
    }

