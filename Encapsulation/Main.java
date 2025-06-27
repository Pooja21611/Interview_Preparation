public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice", 15000);

        emp.displayInfo();

        emp.setSalary(18000);
        emp.setName("Alice Sharma");

        emp.displayInfo();
    }
}
