package edu.neu.csye6200;

import java.util.Date;

public class StudentFactory {

    public Student getStudent(String name, int age, int id, String parentName, String address, Date walkInDate) {
        return new Student(name, age, id, parentName, address, walkInDate);
    }

}
