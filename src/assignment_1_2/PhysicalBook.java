package assignment_1_2;

public class PhysicalBook extends Book {

	public PhysicalBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor() + ", Genre: " + getGenre());
    }
}
