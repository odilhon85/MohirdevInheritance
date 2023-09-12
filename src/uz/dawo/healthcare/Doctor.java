package uz.dawo.healthcare;

public class Doctor {

    private String firstName;
    private String lastName;
    private String specialization;
    private int licenseNumber;
    private int yearOfExperiance;

    public Doctor() {
    }

    public Doctor(String firstName, String lastName, String specialization, int licenseNumber, int yearOfExperiance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
        this.yearOfExperiance = yearOfExperiance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearOfExperiance() {
        return yearOfExperiance;
    }

    public void setYearOfExperiance(int yearOfExperiance) {
        this.yearOfExperiance = yearOfExperiance;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", licenseNumber=" + licenseNumber +
                ", yearOfExperiance=" + yearOfExperiance +
                '}';
    }
}
