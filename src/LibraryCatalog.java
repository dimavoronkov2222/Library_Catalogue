import java.util.ArrayList;
import java.util.List;
public class LibraryCatalog {
    private List<LibraryItem> items = new ArrayList<>();
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.display();
            System.out.println();
        }
    }
    public void searchByTitle(String title) {
        System.out.println("Поиск по названию: " + title);
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.display();
                return;
            }
        }
        System.out.println("Элемент с названием \"" + title + "\" не найден.");
    }
    public void searchByAuthor(String author) {
        System.out.println("Поиск по автору: " + author);
        boolean found = false;
        for (LibraryItem item : items) {
            if (item instanceof Book && ((Book) item).getAuthor().equalsIgnoreCase(author)) {
                item.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книги автора \"" + author + "\" не найдены.");
        }
    }
}
