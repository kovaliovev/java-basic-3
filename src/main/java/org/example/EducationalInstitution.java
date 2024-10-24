package org.example;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "EducationalInstitution { " +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", establishedYear=" + establishedYear +
                ", numberOfStudents=" + numberOfStudents +
                ", type='" + type + '\'' +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationalInstitution that = (EducationalInstitution) o;
        return establishedYear == that.establishedYear &&
                numberOfStudents == that.numberOfStudents &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, establishedYear, numberOfStudents, type);
    }
}