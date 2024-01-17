package assignment_1_2;

 abstract class Book {
	
	private String title;
    private String author;
    private String genre;
    private boolean available;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }
     public String getTitle() {
    	  return title; 	 
     }
        
     public String getAuthor() {
         return author;
     }

     public String getGenre() {
         return genre;
     }

     public boolean isAvailable() {
         return available;
     }

     public void setAvailable(boolean available) {
         this.available = available;
     }   
    
     public abstract void displayDetails();
     

}
