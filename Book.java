class Book {
    private String title;
    private String author;
    private double price;

    // Конструктор
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Метод для застосування знижки
    public void applyDiscount(double discountPercent) {
        if (discountPercent >= 0 && discountPercent <= 100) {
            double discountAmount = price * (discountPercent / 100);
            price -= discountAmount;
        } else {
            System.out.println("Знижка має бути в межах від 0 до 100.");
        }
    }

    // Метод для виведення інформації про книгу
    public void printInfo() {
        System.out.printf("Назва: %s, Автор: %s, Ціна: %.2f грн%n", title, author, price);
    }
}