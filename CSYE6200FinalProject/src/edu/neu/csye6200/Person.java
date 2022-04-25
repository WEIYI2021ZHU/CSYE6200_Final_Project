package edu.neu.csye6200;

public class Person {
    private String name;
    private int age;
    private String phoneNum;

    public Person() {
    }

    public Person(String name, int age, String phoneNum) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}

