class Bookk {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Access private author
    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }
}

// Subclass
class EBook extends Book {
    int fileSizeMB;

    EBook(String ISBN, String title, String author, int fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    void displayEBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() +
                           ", Size: " + fileSizeMB + " MB");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("1234", "Java Basics", "Alice", 15);
        eb.displayEBook();
    }
}
