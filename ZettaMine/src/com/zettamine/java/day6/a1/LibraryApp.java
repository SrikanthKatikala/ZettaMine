package com.zettamine.java.day6.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Display all Book Details");
            System.out.println("3. Search Book by Author");
            System.out.println("4. Count Number of books - by book name");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    Book newBook = new Book();
                    System.out.print("Enter the isbn no: ");
                    newBook.setIsbnNo(sc.nextLong());
                    sc.nextLine(); 
                    System.out.print("Enter the book name: ");
                    newBook.setBookTitle(sc.nextLine());
                    System.out.print("Enter the author name: ");
                    newBook.setBookAuthor(sc.nextLine());
                    library.addBook(newBook);
                    break;
                case 2:
                    List<Book> allBooks = library.viewAllBooks();
                    for (Book book : allBooks) {
                        System.out.println("ISBN no: " + book.getIsbnNo() +
                                " | Book name: " + book.getBookTitle() +
                                " | Author name: " + book.getBookAuthor());
                    }
                    break;
                case 3:
                    System.out.print("Enter the author name: ");
                    String authorName = sc.nextLine();
                    ArrayList<Book> booksByAuthor = library.viewBooksByAuthor(authorName);
                    if (booksByAuthor.isEmpty()) {
                        System.out.println("None of the book published by the author " + authorName);
                    } else {
                        for (Book book : booksByAuthor) {
                            System.out.println("ISBN no: " + book.getIsbnNo() +
                                    " | Book name: " + book.getBookTitle() +
                                    " | Author name: " + book.getBookAuthor());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter the book name: ");
                    String bookName = sc.nextLine();
                    int bookCount = library.countNoOfBook(bookName);
                    System.out.println("Count of books with the name " + bookName + ": " + bookCount);
                    break;
                case 5:
                	System.err.println("Program exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
