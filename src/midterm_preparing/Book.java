package midterm_preparing;

public class Book {
    private String title;
    private String author;
    private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Book)) return false;
        Book book = (Book) o;
        if(isbn != book.isbn) return false;
        if(!title.equals(book.title)) return false;
        if(!author.equals(book.author)) return false;
        return true;


    }
    public int hashCode(){
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + isbn;
        return result;

    }

    public String toString(){
        return title + "\t" + author + "\t" + isbn;

    }
}
