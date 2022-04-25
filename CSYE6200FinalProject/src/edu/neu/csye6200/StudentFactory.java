package edu.neu.csye6200;

import java.util.Date;

public class StudentFactory extends AbstractPersonFactory{

    private static StudentFactory instance;

    private StudentFactory(){
        instance = null;
    }

    public static synchronized StudentFactory getInstance(){
        if(instance == null){
            instance = new StudentFactory();
        }
        return instance;
    }

    @Override
    public Person getStudent(String name, int age, String phoneNum, int id, String parentName, String address, Date walkInDate) {
        return new Student(name, age, phoneNum, id, parentName, address, walkInDate);
    }

    //Useless, Do not use this since this is the student factory.
    @Override
    public Person getTeacher(String name, int age, String phoneNumber, double credits, int minStuAge, int maxStuAge, int capacity){
        return null;
    }

}
