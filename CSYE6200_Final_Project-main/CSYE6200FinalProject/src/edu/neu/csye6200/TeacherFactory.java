package edu.neu.csye6200;

import java.util.Date;

public class TeacherFactory extends AbstractPersonFactory{

    private static final TeacherFactory instance = new TeacherFactory();

    private TeacherFactory(){}

    public static TeacherFactory getInstance(){
        return instance;
    }

    @Override
    public Person getTeacher(String name, int age, String phoneNumber, double credits, int minStuAge, int maxStuAge, int capacity) {
        return new Teacher(name, age, phoneNumber, credits, minStuAge, maxStuAge, capacity);
    }

    //Useless, Do not use this since this is the student factory.
    @Override
    public Person getStudent(String name, int age, String phoneNum, int id, String parentName, String address, Date walkInDate){
        return null;
    }


}

