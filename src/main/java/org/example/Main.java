package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        EducationalInstitution[] institutions = {
                new EducationalInstitution("University A", "Street 1", 1960, 3000, "University"),
                new EducationalInstitution("College B", "Street 2", 1960, 4000, "College"),
                new EducationalInstitution("University C", "Street 3", 1970, 3000, "University"),
                new EducationalInstitution("Institute D", "Street 4", 1990, 1000, "Institute"),
                new EducationalInstitution("College E", "Street 5", 1930, 3000, "College")
        };

        Arrays.sort(institutions, Comparator
                .comparingInt(EducationalInstitution::getNumberOfStudents)
                .thenComparing(Comparator.comparingInt(EducationalInstitution::getEstablishedYear).reversed()));

        System.out.println("Sorted array:");
        for (EducationalInstitution institution : institutions) {
            System.out.println(institution);
        }

        EducationalInstitution searchInstitution = new EducationalInstitution("College B", "Street 2", 1960, 4000, "College");

        boolean found = false;
        for (EducationalInstitution institution : institutions) {
            if (institution.equals(searchInstitution)) {
                System.out.println("Identical institution is found: " + institution);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Identical institution was not found");
        }
    }
}