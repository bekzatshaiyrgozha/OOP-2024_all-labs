package Bonus_task_1;

import java.util.HashMap;
import java.util.Scanner;

public class Library_KBTU {
    private HashMap<String,Integer> ExistingBooks = new HashMap<String,Integer>();
    private HashMap<String,String> BookAndStudentName = new HashMap<String,String>();

    public void addBooks(String book,int quantity) {
        if(ExistingBooks.containsKey(book)) {
            ExistingBooks.put(book,ExistingBooks.get(book)+quantity);
        }else {
            ExistingBooks.put(book, quantity);
        }
        System.out.println("Book " + book + " add to library. Quantity:" + quantity);
    }


    public void getBook(String book,String reader) {
        if(ExistingBooks.containsKey(book) && ExistingBooks.get(book) > 0) {
            ExistingBooks.put(book,ExistingBooks.get(book) - 1);
            BookAndStudentName.put(book,reader);
            System.out.println("Student " + reader + " get book " + book);
        }else if(ExistingBooks.containsKey(book)) {
            System.out.println("Book " + book + " get " + BookAndStudentName.get(book));
        }
    }

    public void display() {
        if(ExistingBooks.isEmpty()) {
            System.out.println("Students get all books.");
        } else {
            System.out.println("Existing books:");
            for(String book : ExistingBooks.keySet()) {
                System.out.println("Book:" + book + "(quantity:" + ExistingBooks.get(book ) + ")");
            }
        }
    }

    public static void main(String [] avgs) {
        Scanner scanner = new Scanner(System.in);
        Library_KBTU library = new Library_KBTU();

        System.out.println("Enter number  of book in library:");
        int numberBook = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<numberBook;i++) {
            System.out.println("Enter name book:");
            String book = scanner.nextLine();

            System.out.println("Enter quantuty:");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            library.addBooks(book, quantity);
        }

        library.display();

        System.out.println("Enter number of students:");

        int numberStudents = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<numberStudents;i++) {
            System.out.println("Enter student " + (i+1) + ":" );
            String student = scanner.nextLine();

            System.out.println("Enter book name , want student:");
            String book = scanner.nextLine();

            library.getBook(book, student);
        }
        library.display();

    }


}
