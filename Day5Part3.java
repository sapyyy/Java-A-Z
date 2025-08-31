class Book {
    String name;
    int pages;

    static {
        System.out.println("Please return all the books");
    }

    // parameterized constructor
    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    // copy constructor
    Book(Book obj) {
        this.name = obj.name;
        this.pages = obj.pages;
    }

    // a method that returns object
    public Book returnObj() {
        return this;
    }
}

public class Day5Part3 {
    public static void main(String[] args) {
        Book book = new Book("The Complete Reference", 580);
        Book book2 = new Book(book);
        book.pages = 700;
        System.out.println(book2.pages);

        Book newBook = book.returnObj();
        if (book == newBook) {
            System.out.println("same objects");
        }
    }
}
