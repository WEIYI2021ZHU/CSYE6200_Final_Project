package edu.neu.csye6200;

public class Test2 {
	public static void main(String[] args ){
		Student s1 = new Student("Peter", 12, 1, "John", "address1", null);
		Student s2 = new Student("Peter2", 13, 2, "John2", "address2", null);
		Student s3 = new Student("Peter3", 20, 3, "John3", "address3", null);
		Student s4 = new Student("Peter4", 18, 4, "John4", "address4", null);
		Student s5 = new Student("Peter5", 22, 5, "John5", "address5", null);
		
		Teacher teacher = new Teacher("Tim", 34, 4.5, 13, 24, 4);
		teacher.setStuList(s1);// cannot be added into the list
		teacher.setStuList(s5);
		teacher.setStuList(s4);
		teacher.setStuList(s3);
		teacher.setStuList(s2);
		
		Classroom cr = new Classroom(1, 13, 24, 3);
		cr.setGroup(teacher);
		System.out.println(cr);
		System.out.println(teacher);
	}
}
