package models;

import java.util.Date;

public abstract class AbstractPersonFactory {
    public abstract Person getTeacher(String name, int age, String phoneNumber, double credits, int minStuAge, int maxStuAge, int capacity);
    public abstract Person getStudent(String name, int age, String phoneNum, int id, String parentName, String address, Date walkInDate);
	public Person getTeacher(String name, int age, String phoneNumber, int id, double credits, int minStuAge,
			int maxStuAge, int capacity) {
		// TODO Auto-generated method stub
		return null;
	}
}