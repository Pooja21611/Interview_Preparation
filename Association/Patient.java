class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void visitDoctor(Doctor doc) {
        System.out.println(this.name + " is visiting Dr. " + doc.name);
    }
}