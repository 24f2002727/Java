package access_modifier.library;

public class LibraryMember extends LibrarySystem {

    public void showFine(int dayLate)
    {
        double fine=calculateFine(dayLate);
        System.out.println("Fine for "+dayLate+fine);
    }
    
    public void showBooks()
    {
        System.out.println("Availale books are :"+totalBooks);
    }
}
