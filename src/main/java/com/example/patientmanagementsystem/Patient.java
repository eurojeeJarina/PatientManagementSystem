package com.example.patientmanagementsystem;


/*Patient Class - Extends the person class with additional variables;

* id = increment value increase for new admissions unique with each instance of a class.
* age = patient's age (Date of birth - present year)
* admissionDate = the date when the patient was admitted
* prescriptions = variable holds if patients have any prescriptions
* allergies = variable holds if patient have any allergies
* specialRequest = variable holds if patient have any special request from multidisciplinary team
* */


public class Patient extends Person{

    private int id;
    private int age;
    private String admissionDate;
    private String sicknessHistory;
    private String prescriptions;
    private String allergies;
    private String specialRequests;

    public Patient(String _title, String _firstName, String _middleName, String _surname, String _birthDate, String _gender, String _homeAddress, int _phoneNumber, int id, int age, String admissionDate, String sicknessHistory, String prescriptions, String allergies, String specialRequests) {
        super(_title, _firstName, _middleName, _surname, _birthDate, _gender, _homeAddress, _phoneNumber);
        this.id = id;
        this.age = age;
        this.admissionDate = admissionDate;
        this.sicknessHistory = sicknessHistory;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialRequests = specialRequests;
    }

    public Patient(int id, int age, String admissionDate, String sicknessHistory, String prescriptions, String allergies, String specialRequests) {
        this.id = id;
        this.age = age;
        this.admissionDate = admissionDate;
        this.sicknessHistory = sicknessHistory;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialRequests = specialRequests;
    }

    // DEFAULT VALUES
    public Patient()
    {
        this.id += 1;
        this.age = 99;
        this.admissionDate = "10/10/2021";
        this.sicknessHistory = "Default";
        this.prescriptions = "Default";
        this.allergies = "Default";
        this.specialRequests = "Default";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getSicknessHistory() {
        return sicknessHistory;
    }

    public void setSicknessHistory(String sicknessHistory) {
        this.sicknessHistory = sicknessHistory;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    /*FOR DEBUGGING PURPOSE ONLY*/

    public void displayPatientDetails(){
        this.displayDetails();
        System.out.println("ID: " + this.getId());
        System.out.println("Age: " + this.getAge());
        System.out.println("Admission Date: " + this.getAdmissionDate());
        System.out.println("History: " + this.getSicknessHistory());
        System.out.println("Prescriptions: " + this.getPrescriptions());
        System.out.println("Allergies: " + this.getAllergies());
        System.out.println("Special Requests: " + this.getSpecialRequests());
    }
}
