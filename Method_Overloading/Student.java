class Student {

    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void storeStudentDetails() {
        System.out.println("Storing student details (default):");
        System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address);
    }

    public void storeStudentDetails(String name) {
        System.out.println("Storing student with Name: " + name);
    }

    public void storeStudentDetails(int id, String name) {
        System.out.println("Storing student with ID: " + id + " and Name: " + name);
    }

    public void storeStudentDetails(int id, String name, String address) {
        System.out.println("Storing complete student details:");
        System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address);
    }
}
