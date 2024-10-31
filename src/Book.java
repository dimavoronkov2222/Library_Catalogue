public class Book implements LibraryItem {
    private String author;
    private String title;
    private String genre;
    private int pages;
    public Book(String author, String title, String genre, int pages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public void display() {
        System.out.println("Книга: " + title + ", Автор: " + author + ", Жанр: " + genre + ", Страниц: " + pages);
    }
}
