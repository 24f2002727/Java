/*
CASE STUDY 1: Library Management System

 

Scenario:

A library develops a system named LibrarySystem.

 

Requirements:

1. Class LibrarySystem must be accessible everywhere.

2. Variable libraryName must be shared and accessible everywhere.

3. Variable totalBooks must be accessible in the same package and subclasses.

4. Variable secretKey must not be accessible outside the class.

5. Method showLibraryInfo() must be accessible everywhere.

6. Method calculateFine() must be accessible only to subclasses.

7. Method generateReport() must be accessible only in the same package.

8. Method validateAdmin() must be accessible only inside LibrarySystem.

 

Questions:

a) Identify access modifiers for each.

b) Justify the choice of private for secretKey.
 */

package access_modifier.library;

public class LibrarySystem {

    public String libraryName="BCE Library";
    protected int totalBooks=5000;
    private String secretKey="BCE1234";

    public void showLibraryInfo()
    {
        //code
        System.out.println("Library name is "+libraryName);
        System.out.println("Total books are :"+totalBooks);

    }

    protected double calculateFine(int dayLate)
    {
        //code
        return 2*dayLate;
    }

    void generateReport()
    {
        //code
        System.out.println("Generating library report...");
    }

    private boolean validateAdmin(String key)
    {
        //code
        return secretKey.equals(key);
    }
    
    public void adminLogin(String key) {
        if (validateAdmin(key)) {
            System.out.println("Admin validated successfully.");
        } else {
            System.out.println("Invalid admin key.");
        }
    
}
}
