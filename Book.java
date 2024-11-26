package excercise1;

import java.util.*;
import java.text.*;

public class Book implements IBook {

    String bookId;
    String publisher;
    Date entryDate;
    double unitPrice;
    double quantity;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    Book() {
    }

    @Override
    public void addBook() {
        System.out.print("Enter book ID: ");
        this.bookId = sc.nextLine();
        System.out.print("Enter publisher: ");
        this.publisher = sc.nextLine();
        System.out.print("Enter entry Date: ");
        try {
            this.entryDate = df.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }
        System.out.print("Enter unit price: ");
        this.unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        this.quantity = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void updateBook(String id) {
        sc.next();
        System.out.print("Enter publisher: ");
        publisher = sc.nextLine();
        System.out.print("Enter entry Date: ");
        try {
            this.entryDate = df.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }
        System.out.print("Enter unit price: ");
        unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void displayBook() {
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Entry date: " + df.format(this.entryDate));
        System.out.println("Unit Price: " + this.unitPrice);
        System.out.println("Quantity: " + this.quantity);
    }

    public String getId() {
        return bookId;
    }
}
