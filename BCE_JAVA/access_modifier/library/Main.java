package access_modifier.library;

public class Main{
    
    public static void main(String args[]) {

        LibrarySystem lib = new LibrarySystem();
        lib.showLibraryInfo();
        lib.adminLogin("BCE1234");

        LibraryMember member = new LibraryMember();
        member.showFine(4);
        member.showBooks();

        // The following will cause errors if uncommented:
        // lib.secretKey;          // private
        // lib.validateAdmin("x"); // private
        // lib.calculateFine(3);   // protected
    }
}
    

