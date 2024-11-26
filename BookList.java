package excercise1;

import java.util.*;

public class BookList {

    public ArrayList<Book> bookList;
    Scanner sc = new Scanner(System.in);

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook() {
        System.out.println("Enter number of books: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book " + (i + 1) + ": \n");
            System.out.println("\nT: Text Book\nR: Reference Book\nAny key: OtherBook ");
            String type = sc.nextLine();
            sc.nextLine();
            Book b;

            switch (type) {
                case "T":
                    b = new TextBook();
                    break;
                case "R":
                    b = new ReferenceBook();
                    break;
                default:
                    b = new Book();
            }
            System.out.println("Enter details for Book " + (i + 1) + ":");
            b.addBook();
            bookList.add(b);
        }
    }

    public void displayAll() {
        for (Book b : bookList) {
            System.out.println("======");
            b.displayBook();
        }
    }

    public void updateBoook(String id) {
        for (Book b : bookList) {
            System.out.println("\nEnter New Information");
            b.updateBook(id);
        }
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id));
            return b;
        }
        return null;
    }

    public void deleteBookById(String id) {
        Book b = findBookById(id);
        if (b != null) {
            bookList.remove(b);
        }
    }
}
