import java.util.List;
public class Newspaper implements LibraryItem {
    private String title;
    private String issueDate;
    private List<String> headlines;
    public Newspaper(String title, String issueDate, List<String> headlines) {
        this.title = title;
        this.issueDate = issueDate;
        this.headlines = headlines;
    }
    public String getTitle() {
        return title;
    }
    public void display() {
        System.out.println("Газета: " + title + ", Дата выпуска: " + issueDate);
        System.out.println("Заголовки: ");
        for (String headline : headlines) {
            System.out.println("- " + headline);
        }
    }
}
