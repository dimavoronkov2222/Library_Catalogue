import java.util.List;
public class Almanac implements LibraryItem {
    private String title;
    private List<Book> books;
    public Almanac(String title, List<Book> books) {
        this.title = title;
        this.books = books;
    }
    public String getTitle() {
        return title;
    }
    public void display() {
        System.out.println("Альманах: " + title);
        System.out.println("Произведения:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
        }
    }
}
