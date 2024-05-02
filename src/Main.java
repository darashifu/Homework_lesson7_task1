import java.security.PrivilegedExceptionAction;

public class Main {
    public static void main(String[] args) {
       LibraryUser librarian = new LibraryUser("Alex");
       LibraryUser administrator = new LibraryUser("Sam");
       LibraryUser reader = new LibraryUser("Gloriya");
       LibrarySupplier librarySupplier = new LibrarySupplier("Martin");


       reader.takeBook("GGG");
       reader.returnBook("GGG");
       librarian.orderBook("ggg", librarySupplier);
       librarySupplier.takeBook("MMM");
       librarySupplier.returnBook("MMM");
       librarySupplier.bringBook("MMM");
       administrator.findAndIssueBook("FFF", reader);
       administrator.overdueNotification(reader);





    }
}