class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
public class CheckedException2 {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age below 18");
    }

    public static void main(String[] args) throws InvalidAgeException{
        //try {
            checkAge(15);
       // }
      //  catch (InvalidAgeException e) {
        //    System.out.println(e.getMessage());
      //  }
    }
}
