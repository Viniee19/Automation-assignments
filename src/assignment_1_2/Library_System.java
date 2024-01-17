package assignment_1_2;

import java.util.List;

public class Library_System {

	public static void main(String[] args) {

		Library library = new Library();
		
		// adding books
		 Book book1 = new PhysicalBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
		 Book book2 = new PhysicalBook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");

		 library.addBooks(book1);
	     library.addBooks(book2);
	     
	  // Displaying available books
	        library.displayAvailableBooks();

	        // Searching for books
	        List<Book> searchResults = library.searchBooks("Java");
	        System.out.println("\nSearch Results:");
	        for (Book result : searchResults) {
	            result.displayDetails();
	        }

	        // Borrowing and returning books
	        library.borrowBook(book1, "John Doe");
	        library.borrowBook(book2, "Jane Doe");
	        library.displayBorrowedBooks("John Doe");

	        library.returnBook(book1, "John Doe");
	        library.displayBorrowedBooks("John Doe");
		
	}

}
