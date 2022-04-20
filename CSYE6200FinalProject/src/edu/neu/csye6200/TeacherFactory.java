package edu.neu.csye6200;

public class TeacherFactory {

    public Teacher getTeacher(String name, int age, double credits, int minStuAge, int maxStuAge, int capacity) {
        return new Teacher(name, age, credits, minStuAge, maxStuAge, capacity);
    }

}
