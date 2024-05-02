public class LibraryUser implements Reader, Librarian, Administrator{
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(name + " Уведомил читателя о просрочке книги");
    }

    @Override
    public void findAndIssueBook(String bookTitle, Reader reader) {
        System.out.println(name + " Нашел книгу " + bookTitle + " и передал читателю");
        reader.takeBook(bookTitle);
    }

    @Override
    public void orderBook(String bookTitle, Supplier supplier) {
        System.out.println(name + " Заказал книгу " + bookTitle + " у поставщика " );
        supplier.bringBook(bookTitle);
    }

    @Override
    public void takeBook(String bookTitle) {
        System.out.println(name + "Взял книгу: " + bookTitle);
    }

    @Override
    public void returnBook(String bookTitle) {
        System.out.println(name + " Вернул книгу: " + bookTitle);
    }
    public String getName(){
        return name;
    }
}

