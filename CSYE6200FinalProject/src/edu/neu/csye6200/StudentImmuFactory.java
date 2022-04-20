package edu.neu.csye6200;

import java.util.Date;

public class StudentImmuFactory {

    public StudentImmu getStudentImmu(int Stuid, String studentName, String vaccineName, int age, int doseAccepted, Date dateAccepted) {
        return new StudentImmu(Stuid, studentName, vaccineName, age, doseAccepted, dateAccepted);
    }

}