import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

class Book {
    private String title;
    private String category;
    private String status;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String accessLevel;

    public Book(String title, String category, String accessLevel) {
        this.title = title;
        this.category = category;
        this.status = "available";
        this.accessLevel = accessLevel;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void toGetBook() {
        this.status = "borrowed";
        this.borrowDate = LocalDate.now();
        this.returnDate = borrowDate.plusWeeks(2);
    }

    public void returnBook() {
        this.status = "available";
        this.borrowDate = null;
        this.returnDate = null;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isAvailable() {
        return this.status.equals("available");
    }
}

public class MagicalLibrarySystem {
    private static HashMap<String, Vector<Book>> booksByCategory = new HashMap<>();
    private static HashMap<String, String> borrowed = new HashMap<>(); // book name and student name
    private static HashMap<String, String> studentId = new HashMap<>(); // book name and student ID

    private static final String SECRET_BOOK_PASSWORD = "KBTUsila";

    public static void main(String[] args) {
        Vector<Book> dragonology = new Vector<>();
        dragonology.add(new Book("Dragon Slayer Handbook", "Dragonology", "common"));
        dragonology.add(new Book("Advanced Dragonology", "Dragonology", "secret"));

        Vector<Book> potionMaking = new Vector<>();
        potionMaking.add(new Book("Elixir of Invisibility", "Potion Making", "common"));
        potionMaking.add(new Book("Forbidden Potions", "Potion Making", "forbidden"));

        Vector<Book> spells = new Vector<>();
        spells.add(new Book("Levitation Charm", "Spells", "common"));
        spells.add(new Book("Fireball Spell", "Spells", "secret"));

        Vector<Book> alchemy = new Vector<>();
        alchemy.add(new Book("Transmutation Guide", "Alchemy", "common"));
        alchemy.add(new Book("Philosopher's Stone Creation", "Alchemy", "forbidden"));

        Vector<Book> ancientMagic = new Vector<>();
        ancientMagic.add(new Book("Rituals of the Old Wizards", "Ancient Magic", "secret"));
        ancientMagic.add(new Book("Forbidden Spells", "Ancient Magic", "forbidden"));

        booksByCategory.put("Dragonology", dragonology);
        booksByCategory.put("Advanced Dragonology", dragonology);
        booksByCategory.put("Potion Making", potionMaking);
        booksByCategory.put("Spells", spells);
        booksByCategory.put("Alchemy", alchemy);
        booksByCategory.put("Ancient Magic", ancientMagic);

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the Magical Library!");

        while (true) {
            System.out.println("\nPlease enter a command (getBook, returnBook, check, break):");
            input = sc.nextLine();

            switch (input) {
                case "getBook":
                    toGetBook(sc);
                    break;
                case "returnBook":
                    toReturn(sc);
                    break;
                case "check":
                    toCheck();
                    break;
                case "break":
                    System.out.println("Goodbye, come back again!");
                    return;
                default:
                    System.out.println("Unknown request, try again please.");
            }
        }
    }

    public static void toGetBook(Scanner sc) {
        System.out.println("Enter your name please: ");
        String name = sc.nextLine();
        System.out.println("Enter your Student ID please: ");
        String id = sc.nextLine();
        System.out.println("Which book category would you like to borrow from (Dragonology, Potion Making, Spells, Alchemy, Ancient Magic)?: ");
        String category = sc.nextLine();

        if (!booksByCategory.containsKey(category)) {
            System.out.println("Sorry, we don't have this category in our magical library.");
            return;
        }

        System.out.println("Which book would you like to borrow ?: ");
        Vector<Book> selectedCategory = booksByCategory.get(category);
        for (Book book : selectedCategory) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " Access: " + book.getAccessLevel());
            }
        }
        String title = sc.nextLine();

        for (Book book : selectedCategory) {
            if (book.getTitle().equals(title)) {
                if (!book.isAvailable()) {
                    System.out.println("Sorry, the book '" + title + "' is currently borrowed.");
                    return;
                }

                if (book.getAccessLevel().equals("secret")) {
                    System.out.println("This is a secret book. Please enter the password:");
                    String password = sc.nextLine();
                    if (!password.equals(SECRET_BOOK_PASSWORD)) {
                        System.out.println("Incorrect password. You cannot borrow this book.");
                        return;
                    }
                }

                if (book.getAccessLevel().equals("forbidden")) {
                    System.out.println("This is a forbidden book. Do you have special access privileges? yes/no");
                    String access = sc.nextLine();
                    if (!access.equals("yes")) {
                        System.out.println("You need special access privileges to borrow this book.");
                        return;
                    }
                }

                book.toGetBook();
                borrowed.put(title, name);
                studentId.put(title, id);

                System.out.println("The magical book - '" + title + "' is now borrowed by " + name + " with Student ID " + id + ".");
                System.out.println("Borrow Date: " + book.getBorrowDate());
                System.out.println("Please return the book by " + book.getReturnDate() + ".");
                return;
            }
        }

        System.out.println("Sorry, the book '" + title + "' is not available or doesn't exist in this magical library.");
    }

    public static void toReturn(Scanner sc) {
        System.out.println("Which magical book do you want to return? (please enter the title of the book)");
        String title = sc.nextLine();

        for (Vector<Book> categoryBooks : booksByCategory.values()) {
            for (Book book : categoryBooks) {
                if (book.getTitle().equals(title) && !book.isAvailable()) {
                    book.returnBook();
                    borrowed.remove(title);
                    System.out.println("Thank you for returning the magical book '" + title + "'. We hope it was useful in your magical studies!");
                    return;
                }
            }
        }
        System.out.println("This book was not borrowed or it was not from this magical library.");
    }

    public static void toCheck() {
        System.out.println("\nCurrent Magical Library Status:");
        for (String category : booksByCategory.keySet()) {
            System.out.println("Category: " + category);
            Vector<Book> categoryBooks = booksByCategory.get(category);
            for (Book book : categoryBooks) {
                if (book.isAvailable()) {
                    System.out.println("The magical book '" + book.getTitle() + "' is AVAILABLE (Access: " + book.getAccessLevel() + ").");
                } else {
                    System.out.println("The magical book '" + book.getTitle() + "' is BORROWED by " + borrowed.get(book.getTitle()) + " (Student ID: " + studentId.get(book.getTitle()) + ").");
                    System.out.println("Borrow Date: " + book.getBorrowDate() + " | Return Date: " + book.getReturnDate());
                }
            }
        }
    }
}
