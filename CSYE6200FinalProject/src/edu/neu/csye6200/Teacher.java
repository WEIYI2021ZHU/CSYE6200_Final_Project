package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private int id;
    private double credits;
    private int minStuAge;
    private int maxStuAge;
    private int Capacity;
    private List<Student> StuList;

    public Teacher(String name, int age, String phoneNumber, int id, double credits, int minStuAge, int maxStuAge, int capacity) {
        super(name, age, phoneNumber);
        this.id = id;
        this.credits = credits;
        this.minStuAge = minStuAge;
        this.maxStuAge = maxStuAge;
        Capacity = capacity;
        StuList = new ArrayList<>();
    }


    public void setStuList(Student aStu) {
        if( StuList.size() < Capacity ) {
            if( !StuList.contains(aStu) && aStu.getAge() >= minStuAge && aStu.getAge()<=maxStuAge){
                StuList.add( aStu );
            }
        }
        //else System.out.println("can not insert");
    }

    @Override
    public boolean equals(Object person){
        if( !(person instanceof  Teacher) ) return false;
        else if(((Teacher) person).getId() == this.id){
                return true;
        }
        return false;

    }

    public int getId() {
        return id;
    }

    public double getCredits() {
        return credits;
    }

    public int getMinStuAge() {
        return minStuAge;
    }

    public int getMaxStuAge() {
        return maxStuAge;
    }

    public int getCapacity() {
        return Capacity;
    }

    public List<Student> getStuList() {
        return StuList;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setMinStuAge(int minStuAge) {
        this.minStuAge = minStuAge;
    }

    public void setMaxStuAge(int maxStuAge) {
        this.maxStuAge = maxStuAge;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return "\n\nTeacher Name: " + super.getName() +
                " id: " + id +
                " Age: " + super.getAge() +
                " Phone number: " + super.getPhoneNum() +
                " Credits: " + credits +
                " MinStuAge: " + minStuAge +
                " MaxStuAge: " + maxStuAge +
                " Capacity:" + Capacity +
                "\n\tTeaching Student:" + getAllStudent() ;
    }

    private String getAllStudent(){
        String ret = "";

        for(Student i: StuList){
            ret += "\n\t" + i.getName() + " ID: " + i.getId();
        }

        return ret;
    }

}
