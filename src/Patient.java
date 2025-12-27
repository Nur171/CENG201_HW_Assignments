public class Patient {

    // Author: Nur Aksoy - 230444046

    // * This class to represent a patient in hospital system
    int id ;
    String name;
    int severity;  // from 1 to 10
    int age;

    // * The constructor
    public Patient(int id, String name, int severity, int age){
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    // * For printing the patient information
    public String printInfo(){
        return "Patient:\n" +
               " Id = " + id + "\n" +
               " Name = " + name + "\n" +
               " Severity = " + severity + "\n" +
               " Age = " + age + "\n" ;
    }
}
