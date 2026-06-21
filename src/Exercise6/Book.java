package Exercise6;

class Book {
    private String title; // Tiêu đề sách
    private String author; // Tác giả sách
    private String isbn; // Mã ISBN
    private int year; // Năm xuất bản

    // Constructor
    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDetails() {
        return "Tiêu đề: " + title + ", Tác giả: " + author + ", ISBN: " + isbn + ", Năm xuất bản: " + year;
    }
}
