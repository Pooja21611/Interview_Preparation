import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice");

        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println(" Object has been serialized.");

            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student deserializedStudent = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(" Object has been deserialized.");
            System.out.println("ID: " + deserializedStudent.id);
            System.out.println("Name: " + deserializedStudent.name);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
