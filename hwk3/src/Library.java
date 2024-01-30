import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, String> books = new HashMap<>();

    public void addBook(String book, String author) {
        books.put(book, author);
    }

    public void issueBook(String book) {
        if (books.containsKey(book)) {
            books.remove(book);
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(String book, String author) {
        books.put(book, author);
    }

    public void displayBooks() {
        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", Author: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.displayBooks();
    }
}
