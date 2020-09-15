package com.company;

public class HeartRate {
    String firstName,lastName;
           double dateOfBirth;

    public HeartRate(String firstName, String lastName, double dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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

    public double getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(double dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Double getHeartRate()
    {
        return 220-getDateOfBirth();
    }
}
