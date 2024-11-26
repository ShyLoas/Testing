package excercise1;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n========= MENU =========");
        System.out.println("1. Add Books");
        System.out.println("2. Update Book by ID");
        System.out.println("3. Delete Book by ID");
        System.out.println("4. Find Book by ID");
        System.out.println("5. Display all Books");
        System.out.println("6. Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    bookList.addBook();
                    break;
                case 2:
                    System.out.print("Enter the ID of the book to update: ");
                    String updateId = sc.nextLine();
                    sc.nextLine();
                    bookList.updateBoook(updateId);
                    break;
                case 3:
                    System.out.print("Enter ID to Delete: ");
                    String deleteId = sc.nextLine();
                    sc.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 4:
                    System.out.print("Enter the ID of the book to find: ");
                    String findId = sc.nextLine();
                    sc.nextLine();
                    Book foundBook = bookList.findBookById(findId);
                    if (foundBook != null) {
                        System.out.println("\nBook details:");
                        foundBook.displayBook();
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 5:
                    bookList.displayAll();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Enter correct choice!");
                    break;
            }
        }
    }
}
