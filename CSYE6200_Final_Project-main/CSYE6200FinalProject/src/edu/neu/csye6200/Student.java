package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person{

    private int id;
    private String parentName;
    private String address;
    private Date walkInDate;
    private List<StudentImmu> immuInfo;

    public Student(String name, int age, String phoneNum ,int id, String parentName, String address, Date walkInDate) {
        super(name, age, phoneNum);
        this.id = id;
        this.parentName = parentName;
        this.address = address;
        this.walkInDate = walkInDate;
        this.immuInfo = new ArrayList<>();
    }

    public void addImmuRecord( StudentImmu newRecord ){
        if ( newRecord.getStuId() == this.id) {
            if (!immuInfo.contains(newRecord)) {
                immuInfo.add(newRecord);
            } else {
                int index = immuInfo.indexOf(newRecord);
                immuInfo.set(index, newRecord);
            }
        }
    }

    @Override
    public boolean equals(Object student){
        if( !(student instanceof  Student) ) return false;
        else if(((Student) student).getId() == this.id){
            return true;
        }
        return false;

    }

    public int getId() {
        return id;
    }

    public String getParentName() {
        return parentName;
    }

    public String getAddress() {
        return address;
    }

    public Date getWalkInDate() {
        return walkInDate;
    }

    public List<StudentImmu> getImmuInfo() {
        return immuInfo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWalkInDate(Date walkInDate) {
        this.walkInDate = walkInDate;
    }

    public void setImmuInfo(List<StudentImmu> immuInfo) {
        this.immuInfo = immuInfo;
    }

    @Override
    public String toString() {
        return "Student Name: " + super.getName() +
                " id: " + id +
                " Age: " + super.getAge() +
                " Parent Phone number: " + super.getPhoneNum() +
                " ParentName: " + parentName +
                " Address: " + address +
                " WalkInDate: " + walkInDate +
                "\n\tImmunization Info: " + printImmuInfo() ;
    }

    private String printImmuInfo(){
        String ret = "";

        for(StudentImmu i: immuInfo){
            ret += "\n\t" + i.toString();
        }

        return ret;
    }
}
