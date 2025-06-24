public class Main {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Alice", "Engineering", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Bob", "Support", 120, 200);

        emp1.displayDetails();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        emp2.displayDetails();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
