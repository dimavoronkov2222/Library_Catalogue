import java.util.Arrays;
public class LibraryCatalogue {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addItem(new Book("Достоевский Ф.М.", "Преступление и наказание", "Роман", 671));
        catalog.addItem(new Book("Пушкин А.С.", "Евгений Онегин", "Поэма", 224));
        catalog.addItem(new Newspaper("Коммерсантъ", "2024-10-30", Arrays.asList("Политика дня", "Экономический обзор", "Новости спорта")));
        catalog.addItem(new Almanac("Литературный альманах", Arrays.asList(
                new Book("Толстой Л.Н.", "Война и мир", "Роман", 1225),
                new Book("Гоголь Н.В.", "Ревизор", "Комедия", 120)
        )));
        System.out.println("Весь каталог:");
        catalog.displayAllItems();
        catalog.searchByTitle("Евгений Онегин");
        catalog.searchByAuthor("Толстой Л.Н.");
    }
}
