class Main{
    public static void main(String[] args) {
        
        Student s = new Student(101, "Amit", "Delhi");

        s.storeStudentDetails();                              
        s.storeStudentDetails("Pooja");                       
        s.storeStudentDetails(102, "Ravi");                   
        s.storeStudentDetails(103, "Neha", "Mumbai");         
    
    }
}