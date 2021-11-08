package com.example.patientmanagementsystem;

/*Staff Class - represents the staff, the staff can either be given administrative access to modify patient's details
*
* VARIABLES:
* staffId = an int variable that increments each time a new staff/user is added.
* staff_username = String variable store username of a staff/user.
* staff_password = String variable password, must exist in the database in order for access.
* staff_admin = boolean variable, TRUE a staff has been granted access to add or update a patient,
*               FALSE a staff is not authorize to add or update patient's records.
* */

public class Staff extends Person{

    private int staffId;
    private String staff_username;
    private String staff_password;
    private boolean staff_admin;

    public Staff(String _title, String _firstName, String _middleName, String _surname, String _birthDate, String _gender, String _homeAddress, int _phoneNumber, int staffId, String staff_username, String staff_password, boolean staff_admin) {
        super(_title, _firstName, _middleName, _surname, _birthDate, _gender, _homeAddress, _phoneNumber);
        this.staffId = staffId;
        this.staff_username = staff_username;
        this.staff_password = staff_password;
        this.staff_admin = staff_admin;
    }

    public Staff(int staffId, String staff_username, String staff_password, boolean staff_admin) {
        this.staffId = staffId;
        this.staff_username = staff_username;
        this.staff_password = staff_password;
        this.staff_admin = staff_admin;
    }

    public Staff()
    {
        this.staffId += 1;
        this.staff_username = "default username";
        this.staff_password = "default password";
        this.staff_admin = false;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaff_username() {
        return staff_username;
    }

    public void setStaff_username(String staff_username) {
        this.staff_username = staff_username;
    }

    public String getStaff_password() {
        return staff_password;
    }

    public void setStaff_password(String staff_password) {
        this.staff_password = staff_password;
    }

    public boolean isStaff_admin() {
        return staff_admin;
    }

    public void setStaff_admin(boolean staff_admin) {
        this.staff_admin = staff_admin;
    }

    // DEBUGGING PURPOSE ONLY
    public void displayStaffDetails(){
        this.displayDetails();
        System.out.println("ID: " + this.getStaffId());
        System.out.println("Username: " + this.getStaff_username());
        System.out.println("Password: " + this.getStaff_password());
        System.out.println("IsAdmin: " + this.isStaff_admin());
    }
}
