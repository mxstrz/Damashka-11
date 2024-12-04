public class Main {
    public static void main(String[] args) {
        // Робота з класом Book
        System.out.println("Інформація про книги:");
        Book book1 = new Book("Майстер і Маргарита", "Михайло Булгаков", 300.00);
        Book book2 = new Book("Тіні забутих предків", "Михайло Коцюбинський", 250.00);
        Book book3 = new Book("Кобзар", "Тарас Шевченко", 400.00);

        // Застосування знижки 10% до однієї книги
        book3.applyDiscount(10);

        // Виведення інформації про всі книги
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        System.out.println("\nІнформація про коло:");
        // Робота з класом Circle
        Circle circle = new Circle(5.0); // Створення кола з радіусом 5
        circle.printInfo(); // Виведення інформації про коло

        System.out.println("\nІнформація про студентів:");
        // Робота з класом Student
        Student student1 = new Student("Олександр Коваленко", "Група 1", 85.5);
        Student student2 = new Student("Марія Іваненко", "Група 2", 90.0);
        Student student3 = new Student("Дмитро Петров", "Група 3", 75.0);

        // Додавання книг студентам
        student1.addBook(book1);
        student2.addBook(book2);
        student3.addBook(book3);
        student3.addBook(book1);

        // Оновлення середнього бала
        student3.updateGrade(80.0);

        // Виведення інформації про студентів
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}