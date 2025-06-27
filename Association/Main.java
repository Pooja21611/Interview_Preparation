public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Smith");
        Patient patient = new Patient("John");
        patient.visitDoctor(doc);
    }
}
