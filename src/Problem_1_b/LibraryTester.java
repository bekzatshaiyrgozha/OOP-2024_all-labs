package Problem_1_b;

import java.util.Scanner;
import java.util.Vector;
public class LibraryTester {
    public static void main(String[] args) {
        Vector<Book> list = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity books: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<numberOfBooks;i++){
            System.out.println("Enter book name:");
            String bookName = scanner.nextLine();

            System.out.println("Enter author:");
            String author = scanner.nextLine();
            System.out.println("Enter year:");
            int year = scanner.nextInt();
            scanner.nextLine();
            Book book = new Book(bookName, author, year);

            list.add(book);


        }
        for(Book book : list){
            System.out.println(book);
        }

    }
}
