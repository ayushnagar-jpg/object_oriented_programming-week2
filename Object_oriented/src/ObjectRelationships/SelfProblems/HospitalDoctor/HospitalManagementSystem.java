package ObjectRelationships.SelfProblems.HospitalDoctor;

import java.util.ArrayList;

//Patient class
class Patient {
 private String name;
 private ArrayList<Doctor> doctors;

 public Patient(String name) {
     this.name = name;
     this.doctors = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 public void addDoctor(Doctor doctor) {
     doctors.add(doctor);
 }

 public void showDoctors() {
     System.out.println(name + " is consulting with:");
     for (Doctor doctor : doctors) {
         System.out.println("- Dr. " + doctor.getName());
     }
 }
}

//Doctor class
class Doctor {
 private String name;
 private ArrayList<Patient> patients;

 public Doctor(String name) {
     this.name = name;
     this.patients = new ArrayList<>();
 }

 public String getName() {
     return name;
 }

 public void consult(Patient patient) {
     if (!patients.contains(patient)) {
         patients.add(patient);
         patient.addDoctor(this);
     }
     System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
 }

 public void showPatients() {
     System.out.println("Dr. " + name + " is seeing patients:");
     for (Patient patient : patients) {
         System.out.println("- " + patient.getName());
     }
 }
}

//Hospital class
class Hospital {
 private String hospitalName;
 private ArrayList<Doctor> doctors;
 private ArrayList<Patient> patients;

 public Hospital(String hospitalName) {
     this.hospitalName = hospitalName;
     this.doctors = new ArrayList<>();
     this.patients = new ArrayList<>();
 }

 public void addDoctor(Doctor doctor) {
     doctors.add(doctor);
 }

 public void addPatient(Patient patient) {
     patients.add(patient);
 }

 public void showDetails() {
     System.out.println("Hospital: " + hospitalName);
     System.out.println("Doctors:");
     for (Doctor doctor : doctors) {
         System.out.println("- Dr. " + doctor.getName());
     }
     System.out.println("Patients:");
     for (Patient patient : patients) {
         System.out.println("- " + patient.getName());
     }
 }
}

public class HospitalManagementSystem {
 public static void main(String[] args) {
     // Creating hospital
     Hospital hospital = new Hospital("City Hospital");

     // Creating doctors
     Doctor doctor1 = new Doctor("Ayush");
     Doctor doctor2 = new Doctor("Aman");
     
     hospital.addDoctor(doctor1);
     hospital.addDoctor(doctor2);

     // Creating patients
     Patient patient1 = new Patient("Darpan");
     Patient patient2 = new Patient("Ashu");
     
     hospital.addPatient(patient1);
     hospital.addPatient(patient2);

     // Consultations
     doctor1.consult(patient1);
     doctor2.consult(patient1);
     doctor1.consult(patient2);

     // Display details
     hospital.showDetails();
     doctor1.showPatients();
     doctor2.showPatients();
     patient1.showDoctors();
     patient2.showDoctors();
 }
}

