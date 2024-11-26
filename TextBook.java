package excercise1;

import java.util.Date;

public class TextBook extends Book {

    private String status;
    public TextBook(){
        super();
    }
    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    @Override
    public void addBook() {
        super.addBook();
        System.out.print("Enter Status: ");
        this.status = sc.nextLine();
    }

    @Override
    public void updateBook(String id) {
        super.updateBook(id);
        System.out.print("Enter status: ");
        this.status = sc.nextLine();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.print("Status: " + this.status);
    }
}
