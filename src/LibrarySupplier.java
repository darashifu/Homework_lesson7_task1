public class LibrarySupplier implements  Reader, Supplier{
    private String name;

    public LibrarySupplier(String name) {
        this.name = name;
    }
    @Override
    public void takeBook(String bookTitle) {
        System.out.println(name + "взял книгу" + bookTitle + "для промотра ");
    }
    @Override
    public void returnBook(String bookTitle) {
        System.out.println(name+ " вернул книгу" + bookTitle + " после просмотра");
    }
    @Override
    public void bringBook(String bookTitle) {
        System.out.println(name  + "принес книгу  " + bookTitle +  " после просмотра");
    }
    public String getName(){
        return name;
    }
}
