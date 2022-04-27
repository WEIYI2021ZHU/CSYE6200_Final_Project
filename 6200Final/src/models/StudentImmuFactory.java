package models;

import java.util.Date;

public class StudentImmuFactory {

    public static StudentImmu getStudentImmu(int Stuid, String studentName, String vaccineName, int age, int doseAccepted, Date dateAccepted) {
        return new StudentImmu(Stuid, studentName, vaccineName, age, doseAccepted, dateAccepted);
    }

	public static StudentImmu getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}