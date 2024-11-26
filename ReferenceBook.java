package excercise1;

import java.util.Date;

public class ReferenceBook extends Book {

    double tax;
    public ReferenceBook(){
        super();
    }
    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    @Override
    public void addBook() {
        super.addBook();
        System.out.print("Enter Status: ");
        this.tax = sc.nextDouble();
    }

    @Override
    public void updateBook(String id) {
        super.updateBook(bookId);
        System.out.print("Enter status: ");
        this.tax = sc.nextDouble();
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.print("Status: " + this.tax);
    }
}
