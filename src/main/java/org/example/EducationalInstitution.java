package org.example;

public class EducationalInstitution {

    private final String name;
    private final String address;
    private final int establishedYear;
    private final int numberOfStudents;
    private final String type;

    public EducationalInstitution(String name, String address, int establishedYear, int numberOfStudents, String type) {
        this.name = name;
        this.address = address;
        this.establishedYear = establishedYear;
        this.numberOfStudents = numberOfStudents;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getType() {
        return type;
    }
}