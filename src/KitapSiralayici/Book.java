package KitapSiralayici;

public class Book implements Comparable<Book> {

    private String bookName;
    private int number;
    private String authorName;
    private int date;

    public Book(String bookName, int number, String authorName, int date) {
        this.bookName = bookName;
        this.number = number;
        this.authorName = authorName;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public int compareTo(Book book) {
        return this.getNumber()- book.getNumber();
    }

}

