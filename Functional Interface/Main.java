public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;

        Calculator subtract = (a, b) -> a - b;

        Calculator multiply = (a, b) -> a * b;

        Calculator divide = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Add: " + add.operation(10, 5));         
        System.out.println("Subtract: " + subtract.operation(10, 5)); 
        System.out.println("Multiply: " + multiply.operation(10, 5)); 
        System.out.println("Divide: " + divide.operation(10, 5));     
    }
}
