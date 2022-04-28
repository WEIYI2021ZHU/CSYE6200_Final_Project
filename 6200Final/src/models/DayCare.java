package models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DayCare {
	private List<Classroom> classrooms = new ArrayList<Classroom>();
	private List<Student> students = new ArrayList<Student>();
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private List<StudentImmu> studentlmmus = new ArrayList<StudentImmu>();
	private List<Vaccine> vaccines = new ArrayList<Vaccine>();

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<StudentImmu> getStudentlmmus() {
        return studentlmmus;
    }

    public void setStudentlmmus(List<StudentImmu> studentlmmus) {
        this.studentlmmus = studentlmmus;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }
        
	public void addClasroom(Classroom c) {
		classrooms.add(c);
	}
	public void addStudent(Student s) {
		students.add(s);
	}
	public void addTeacher(Teacher t) {
		teachers.add(t);
	}
	public void addStudentImmus(StudentImmu si) {
		studentlmmus.add(si);
	}
	public void addVaccine(Vaccine v) {
		vaccines.add(v);
	}
	public void setStudentImmu() {
		for(Student s : students) {
			for(StudentImmu si : studentlmmus) {
				s.addImmuRecord(si);
			}
		}
		System.out.println(students);
	}
	public void splite() {
		for(Teacher t : teachers) {
			for(Student s : students) {
				t.setStuList(s);
			}
		}
		System.out.println(teachers);
	}
	public void showStudentImmus() {
		for(StudentImmu s : studentlmmus) {
			System.out.println(s);
		}
	}
	public void setGroup() {
		for(Classroom cr : classrooms) {
			for(Teacher t : teachers) {
				cr.setGroup(t);
			}
		}
		System.out.println(classrooms);
	}
	public static DayCare readFile() throws ParseException, IOException {
		DayCare d = new DayCare();
		BufferedReader bw = new BufferedReader(new FileReader("src/files/studentList.txt"));
		String line = null;
		while((line = bw.readLine()) != null) {
			String[] array = line.split(",");
			int id = ConvertUtility.stringConvertInt(array[0]);
			String name = array[1];
			int age = ConvertUtility.stringConvertInt(array[2]);
			String parentName = array[3];
			String phoneNum = array[4];
			String address = array[5];
			Date walkInDate = ConvertUtility.stringConvertDate(array[6]);
			d.addStudent((Student) StudentFactory.getInstance().getStudent(name, age, phoneNum, id, parentName, address, walkInDate));
			
		}
		bw.close();
		
		BufferedReader bw2 = new BufferedReader(new FileReader("src/files/teacherList.txt"));
		String line2 = null;
		while((line2 = bw2.readLine()) != null) {
			String[] array = line2.split(",");
			int id = ConvertUtility.stringConvertInt(array[0]);
			String name = array[1];
			int age = ConvertUtility.stringConvertInt(array[2]);
			String phoneNum = array[3];
			double credits = ConvertUtility.stringConvertDouble(array[4]);
			int minStuAge = ConvertUtility.stringConvertInt(array[5]);
			int maxStuAge = ConvertUtility.stringConvertInt(array[6]);
			int capacity = ConvertUtility.stringConvertInt(array[7]);
			d.addTeacher((Teacher) TeacherFactory.getInstance().getTeacher(name, age, phoneNum, id, credits, minStuAge, maxStuAge, capacity));
			
		}
		bw2.close();
		
		BufferedReader bw3 = new BufferedReader(new FileReader("src/files/studentImmu.txt"));
		String line3 = null;
		while((line3 = bw3.readLine()) != null) {
			String[] array = line3.split(",");
			int Stuid = ConvertUtility.stringConvertInt(array[0]);
			String studentName = array[1];
			String vaccineName = array[2];
			int age = ConvertUtility.stringConvertInt(array[3]);
			int doesAccepted = ConvertUtility.stringConvertInt(array[4]);
			Date dateAccepted = ConvertUtility.stringConvertDate(array[5]);
			d.addStudentImmus(StudentImmuFactory.getStudentImmu(Stuid, studentName, vaccineName, age, doesAccepted, dateAccepted));
			
		}
		bw3.close();
		Vaccine v1 = VaccineFactory.getVaccine(1, "Hib", 1, 24, 4);
		Vaccine v2 = VaccineFactory.getVaccine(2, "DTaP", 3, 24, 4);
		Vaccine v3 = VaccineFactory.getVaccine(3, "Polio", 1, 24, 3);
		Vaccine v4 = VaccineFactory.getVaccine(4, "Hepatitis B", 1, 24, 3);
		Vaccine v5 = VaccineFactory.getVaccine(5, "MMR", 1, 24, 1);
		Vaccine v6 = VaccineFactory.getVaccine(6, "Varicella", 1, 24, 1);
		d.addVaccine(v1);
		d.addVaccine(v2);
		d.addVaccine(v3);
		d.addVaccine(v4);
		d.addVaccine(v5);
		d.addVaccine(v6);
	
		
		Classroom cr1 = ClassroomFactory.getClassroom(1, 6, 12, 3);
		Classroom cr2 = ClassroomFactory.getClassroom(2, 13, 24, 3);
		Classroom cr3 = ClassroomFactory.getClassroom(3, 25, 35, 3);
		Classroom cr4 = ClassroomFactory.getClassroom(4, 36, 47, 3);
		Classroom cr5 = ClassroomFactory.getClassroom(5, 48, 59, 2);
		Classroom cr6 = ClassroomFactory.getClassroom(6, 60, 100, 2);
		d.addClasroom(cr1);
		d.addClasroom(cr2);
		d.addClasroom(cr3);
		d.addClasroom(cr4);
		d.addClasroom(cr5);
		d.addClasroom(cr6);
		
		d.setStudentImmu();
		d.splite();
		d.setGroup();
		return d;
	}
	/*
	public void readTeacher() throws IOException {
		BufferedReader bw = new BufferedReader(new FileReader("src/files/teacherList.txt"));
		String line = null;
		while((line = bw.readLine()) != null) {
			String[] array = line.split(",");
			int id = ConvertUtility.stringConvertInt(array[0]);
			String name = array[1];
			int age = ConvertUtility.stringConvertInt(array[2]);
			String phoneNum = array[3];
			double credits = ConvertUtility.stringConvertDouble(array[4]);
			int minStuAge = ConvertUtility.stringConvertInt(array[5]);
			int maxStuAge = ConvertUtility.stringConvertInt(array[6]);
			int capacity = ConvertUtility.stringConvertInt(array[7]);
			.addTeacher((Teacher) TeacherFactory.getInstance().getTeacher(name, age, phoneNum, id, credits, minStuAge, maxStuAge, capacity));
			System.out.println(teachers);
		}	
	}
	
	public void readStudentLmmu() throws IOException, ParseException {
		BufferedReader bw = new BufferedReader(new FileReader("src/files/studentImmu.txt"));
		String line = null;
		while((line = bw.readLine()) != null) {
			String[] array = line.split(",");
			int Stuid = ConvertUtility.stringConvertInt(array[0]);
			String studentName = array[1];
			String vaccineName = array[2];
			int age = ConvertUtility.stringConvertInt(array[3]);
			int doesAccepted = ConvertUtility.stringConvertInt(array[4]);
			Date dateAccepted = ConvertUtility.stringConvertDate(array[5]);
			DayCare.addStudentImmus(StudentImmuFactory.getStudentImmu(Stuid, studentName, vaccineName, age, doesAccepted, dateAccepted));
			System.out.println(studentlmmus);
		}
		
	}
	
	public void
	*/
}
