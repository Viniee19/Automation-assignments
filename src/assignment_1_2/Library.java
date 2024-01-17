package assignment_1_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
 
	private  List<Book> books ;
	private Map<String, List<Book>> borrowedBooks;
		
	public Library() {
		this.books = new ArrayList<Book>();
		this.borrowedBooks = new HashMap<>();
	}
	
	public void addBooks(Book book) {
		books.add(book);
	}
	
	public void removeBooks(Book book) {
		books.remove(book);
	}
	
	 public List<Book> searchBooks(String keyword) {
	        List<Book> result = new ArrayList<>();
	        for (Book book : books) {
	            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getGenre().contains(keyword)) {
	                result.add(book);
	            }
	        }
	        return result;
	    }

	    public void borrowBook(Book book, String user) {
	        if (book.isAvailable()) {
	            book.setAvailable(false);
	            borrowedBooks.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
	            System.out.println("Book \"" + book.getTitle() + "\" borrowed by " + user);
	        } else {
	            System.out.println("Book \"" + book.getTitle() + "\" is not available for borrowing.");
	        }
	    }

	    public void returnBook(Book book, String user) {
	        if (borrowedBooks.containsKey(user) && borrowedBooks.get(user).contains(book)) {
	            book.setAvailable(true);
	            borrowedBooks.get(user).remove(book);
	            System.out.println("Book \"" + book.getTitle() + "\" returned by " + user);
	        } else {
	            System.out.println("Book \"" + book.getTitle() + "\" was not borrowed by " + user);
	        }
	    }

	    public void displayAvailableBooks() {
	        System.out.println("Available Books:");
	        for (Book book : books) {
	            if (book.isAvailable()) {
	                book.displayDetails();
	            }
	        }
	    }

	    public void displayBorrowedBooks(String user) {
	        if (borrowedBooks.containsKey(user)) {
	       
	            for (Book book : borrowedBooks.get(user)) {
	                System.out.println("\n"+user + "'s Borrowed Books:");
	                book.displayDetails();
	            }
	        } else {
	            System.out.println(user + " has not borrowed any books.");
	        }
	    }
}
