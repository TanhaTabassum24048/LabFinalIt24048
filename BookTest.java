class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(bookId + " " + title + " " + price);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book(1, "Java", 600);
        books[1] = new Book(2, "C++", 450);
        books[2] = new Book(3, "DLD", 700);
        books[3] = new Book(4, "EDCT", 550);
        books[4] = new Book(5, "COA", 400);

        double sum = 0;

        System.out.println("Books with price greater than 500:");
        for (Book b : books) {
            sum += b.price;
            if (b.price > 500) {
                b.display();
            }
        }

        double average = sum / books.length;
        System.out.println("Average Book Price: " + average);
    }
}
