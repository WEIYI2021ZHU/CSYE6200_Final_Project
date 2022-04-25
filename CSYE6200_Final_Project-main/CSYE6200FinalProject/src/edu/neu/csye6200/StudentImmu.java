package edu.neu.csye6200;

import java.util.Date;

public class StudentImmu {

    private int StuId;
    private String StudentName;
    private String VaccineName;
    private int age;
    private int DoseAccepted;
    private Date DateAccepted;

    public StudentImmu(int Stuid, String studentName, String vaccineName, int age, int doseAccepted, Date dateAccepted) {
        StuId = Stuid;
        StudentName = studentName;
        VaccineName = vaccineName;
        this.age = age;
        DoseAccepted = doseAccepted;
        DateAccepted = dateAccepted;
    }

    @Override
    public boolean equals(Object stuImmu){
        if( !(stuImmu instanceof  StudentImmu) ) return false;
        else if(((StudentImmu) stuImmu).getStuId() == this.getStuId()
                && ((StudentImmu) stuImmu).getVaccineName().compareTo(this.getVaccineName()) == 0 ){
            return true;
        }
        return false;

    }

    public int getStuId() {
        return StuId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getVaccineName() {
        return VaccineName;
    }

    public int getAge() {
        return age;
    }

    public int getDoseAccepted() {
        return DoseAccepted;
    }

    public Date getDateAccepted() {
        return DateAccepted;
    }

    public void setStuId(int stuId) {
        StuId = stuId;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setVaccineName(String vaccineName) {
        VaccineName = vaccineName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDoseAccepted(int doseAccepted) {
        DoseAccepted = doseAccepted;
    }

    public void setDateAccepted(Date dateAccepted) {
        DateAccepted = dateAccepted;
    }

    @Override
    public String toString() {
        return "StuId=" + StuId +
                " StudentName :" + StudentName + '\'' +
                " VaccineName :" + VaccineName + '\'' +
                " Age: " + age +
                " DoseAccepted: " + DoseAccepted +
                " DateAccepted: " + DateAccepted ;
    }
}
