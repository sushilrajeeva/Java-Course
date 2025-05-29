package L1_Assignment;

public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    {
        totalBooks+=1;
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }

    static int getTotalBooks() {
        return totalBooks;
    }

    public void borrowBook() {
        if (this.isBorrowed) {
            System.out.println(this.title + " book is already borrowed");
            return;
        }
        System.out.println(this.title + " book is borrowed, enjoy reading");
        this.isBorrowed = true;
    }

    public void returnBook() {
        if(!this.isBorrowed) {
            System.out.println("This book was never borrowed");
            return;
        }
        System.out.println(this.title + " book is returned, hope you enjoyed, please leave a review!");
        this.isBorrowed = false;
    }

    public static void main(String[] args) {
        Book richDadPoorDad = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "9781612680163");
        Book myBook = new Book("5513284644");
        System.out.println(Book.getTotalBooks());

        richDadPoorDad.borrowBook();
        myBook.borrowBook();
        richDadPoorDad.borrowBook();
        richDadPoorDad.returnBook();
        richDadPoorDad.returnBook();
    }


}
