public interface Administrator {
    void overdueNotification(Reader reader);
    void findAndIssueBook(String bookTitle, Reader reader);
}
