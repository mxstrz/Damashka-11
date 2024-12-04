class Circle {
    // Константа PI
    private static final double PI = 3.14159;
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для обчислення площі кола
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Метод для обчислення довжини кола
    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    // Метод для виведення інформації про коло
    public void printInfo() {
        System.out.printf("Радіус кола: %.2f%n", radius);
        System.out.printf("Площа кола: %.2f%n", calculateArea());
        System.out.printf("Довжина кола: %.2f%n", calculateCircumference());
    }
}