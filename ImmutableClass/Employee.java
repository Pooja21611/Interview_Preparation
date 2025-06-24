import java.util.HashMap;
import java.util.Map;

final class Employee {

    private final String employeeName;
    private final int employeeId;
    private final Map<String, String> attributes;

    public Employee(String employeeName, int employeeId, Map<String, String> attributes) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;

        Map<String, String> copiedAttributes = new HashMap<>();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            copiedAttributes.put(entry.getKey(), entry.getValue());
        }
        this.attributes = copiedAttributes;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Map<String, String> getAttributes() {
        Map<String, String> copiedAttributes = new HashMap<>();
        for (Map.Entry<String, String> entry : this.attributes.entrySet()) {
            copiedAttributes.put(entry.getKey(), entry.getValue());
        }
        return copiedAttributes;
    }
}
