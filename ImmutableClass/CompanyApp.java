import java.util.HashMap;
import java.util.Map;

public class CompanyApp {
    public static void main(String[] args) {

        Map<String, String> attributeMap = new HashMap<>();
        attributeMap.put("dept", "engineering");
        attributeMap.put("role", "developer");

        Employee emp = new Employee("Alice", 1001, attributeMap);

        System.out.println(emp.getEmployeeName());
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getAttributes());

        attributeMap.put("level", "senior");
        System.out.println(emp.getAttributes());

        emp.getAttributes().put("location", "remote");
        System.out.println(emp.getAttributes());
    }
}
