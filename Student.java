import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String groupNumber;
    private double averageGrade;
    private List<Book> books;

    // Конструктор
    public Student(String name, String groupNumber, double averageGrade) {
        if (averageGrade < 0 || averageGrade > 100) {
            throw new IllegalArgumentException("Середній бал має бути в межах від 1 до 12.");
        }
        this.name = name;
        this.groupNumber = groupNumber;
        this.averageGrade = averageGrade;
        this.books = new ArrayList<>(); // Ініціалізація ArrayList
    }

    // Метод для додавання книги
    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Книга не може бути null.");
            return;
        }
        books.add(book); // Додавання книги до списку
    }

    // Метод для оновлення середнього бала
    public void updateGrade(double newAverageGrade) {
        if (newAverageGrade < 0 || newAverageGrade > 100) {
            System.out.println("Новий середній бал має бути в межах від 1 до 12.");
            return;
        }
        this.averageGrade = newAverageGrade;
    }

    // Метод для виведення інформації про студента
    public void printInfo() {
        System.out.printf("Ім'я: %s, Група: %s, Середній бал: %.2f%n", name, groupNumber, averageGrade);
        if (books.isEmpty()) {
            System.out.println("Студент не має книг.");
        } else {
            System.out.println("Книги студента:");
            for (Book book : books) {
                book.printInfo();
            }
        }
    }
}
