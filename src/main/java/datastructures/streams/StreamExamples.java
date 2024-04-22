package datastructures.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    /**
     * Given a list, select from list strings beginning with a given string
     * @param list
     * @param val
     * @return
     */
    public List<String> startsWithGivenString(List<String> list, String val) {
        return list.stream()
                .filter(l -> l.startsWith(val))
                .collect(Collectors.toList());
    }

    public List<Person> containsChar(List<Person> males, String string) {
        return males.stream()
                .filter(m -> m.firstName.toLowerCase().contains(string.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Person> mergedAndSorted(List<Person> males, List<Person> females){
        return Stream.concat(males.stream(), females.stream())
                .sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName))
                .collect(Collectors.toList());
    }

    static class Person {
        String firstName;
        String lastName;
        String gender;

        Double salary;

        public Person(String firstName, String lastName, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        public Person(String firstName, String lastName, String gender, Double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.salary = salary;
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

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " " + gender + " " + salary;
        }
    }
}
