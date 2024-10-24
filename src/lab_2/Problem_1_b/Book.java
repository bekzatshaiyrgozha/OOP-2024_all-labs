package lab_2.Problem_1_b;

public class Book extends LibraryItem{
    private int numOfPages;
    public Book(String title, String author, int numOfPages) {
        super(title,author,numOfPages);
        this.numOfPages = numOfPages;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public String toString() {
        return "Book title: " + getTitle() + " author: " + getAuthor() + " numOfPages: " + numOfPages;
    }
}
