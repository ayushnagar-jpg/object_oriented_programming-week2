package EncapPolymorphism.HospitalPatientManagement;

abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;
    
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    
    public abstract double calculateBill();
    
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int numberOfDays;
    private String medicalHistory;
    
    public InPatient(String patientId, String name, int age, double dailyCharge, int numberOfDays) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.numberOfDays = numberOfDays;
    }
    
    @Override
    public double calculateBill() {
        return dailyCharge * numberOfDays;
    }
    
    @Override
    public void addRecord(String record) {
        this.medicalHistory = record;
    }
    
    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;
    
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    
    @Override
    public double calculateBill() {
        return consultationFee;
    }
    
    @Override
    public void addRecord(String record) {
        this.medicalHistory = record;
    }
    
    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John Doe", 45, 500, 5);
        Patient outPatient = new OutPatient("P002", "Jane Doe", 30, 200);
        
        inPatient.getPatientDetails();
        System.out.println("Total Bill: " + inPatient.calculateBill());
        
        outPatient.getPatientDetails();
        System.out.println("Total Bill: " + outPatient.calculateBill());
    }
}
