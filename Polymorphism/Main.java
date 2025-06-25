public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();     // Runtime polymorphism
        Shape shape2 = new Rectangle();  // Runtime polymorphism

        shape1.draw();  // Output: Drawing a circle.
        shape2.draw();  // Output: Drawing a rectangle.
    }
}
