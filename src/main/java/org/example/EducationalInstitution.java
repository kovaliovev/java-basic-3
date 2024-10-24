package org.example;

import java.util.Objects;

/**
 * The {@code EducationalInstitution} class represents an educational institution with basic attributes such as
 * name, address, established year, number of students, and type.
 * <p>
 * This class provides methods to retrieve the details of the institution and overrides {@code toString},
 * {@code equals}, and {@code hashCode} methods.
 * </p>
 */
public class EducationalInstitution {

    private final String name;
    private final String address;
    private final int establishedYear;
    private final int numberOfStudents;
    private final String type;

    /**
     * Constructs an {@code EducationalInstitution} instance with the specified attributes.
     *
     * @param name             the name of the educational institution
     * @param address          the address of the educational institution
     * @param establishedYear  the year the institution was established
     * @param numberOfStudents the number of students enrolled in the institution
     * @param type             the type of educational institution (e.g., university, high school)
     */
    public EducationalInstitution(String name, String address, int establishedYear, int numberOfStudents, String type) {
        this.name = name;
        this.address = address;
        this.establishedYear = establishedYear;
        this.numberOfStudents = numberOfStudents;
        this.type = type;
    }

    /**
     * Returns the name of the educational institution.
     *
     * @return the name of the institution
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the educational institution.
     *
     * @return the address of the institution
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the year the educational institution was established.
     *
     * @return the year of establishment
     */
    public int getEstablishedYear() {
        return establishedYear;
    }

    /**
     * Returns the number of students enrolled in the educational institution.
     *
     * @return the number of students
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * Returns the type of the educational institution (e.g., university, high school).
     *
     * @return the type of the institution
     */
    public String getType() {
        return type;
    }

    /**
     * Returns a string representation of the educational institution, including its name, address,
     * established year, number of students, and type.
     *
     * @return a string representation of the institution
     */
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

    /**
     * Compares this educational institution to the specified object. The result is {@code true} if and only if the
     * argument is not {@code null} and is an {@code EducationalInstitution} object that represents the same
     * institution with the same attributes.
     *
     * @param o the object to compare this institution against
     * @return {@code true} if the given object represents an equivalent institution; {@code false} otherwise
     */
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

    /**
     * Returns a hash code for this educational institution based on its attributes.
     *
     * @return a hash code value for the institution
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, address, establishedYear, numberOfStudents, type);
    }
}
