package Keyword.HospitalManagmentSystem;

class Patient {
    // Static variable shared across all patients
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;
    
    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Unique identifier, cannot be changed
    
    // Constructor using 'this' to resolve ambiguity
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment total patients count
    }
    
    // Static method to display the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    
    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { // Using instanceof for safe type-checking
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
    
    public static void main(String[] args) {
        Patient patient1 = new Patient("Ayush", 30, "Fever", 101);
        Patient patient2 = new Patient("Ashu", 45, "Flu", 102);
        
        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        
        // Display total number of patients
        Patient.getTotalPatients();
    }
}
