package edu.neu.csye6200;

import java.util.Date;

public abstract class AbstractPersonFactory {
    public abstract Person getTeacher(String name, int age, String phoneNumber, double credits, int minStuAge, int maxStuAge, int capacity);
    public abstract Person getStudent(String name, int age, String phoneNum, int id, String parentName, String address, Date walkInDate);
}