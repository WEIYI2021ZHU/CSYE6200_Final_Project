package models;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args ){

        Student astu = new Student("Jack", 12, "1234567890", 1, "JJ", "addresssss", null);
        Student bstu = new Student("Jack", 12, "1234567890", 1, "JJ", "addresssss", null);
        //通过equals 来比较两个student是否一样 不能直接用==判断。
        System.out.println(astu.equals(bstu)); //true

        Teacher atea = new Teacher("Pavrd", 36, "1234567890", 5.0, 6, 12, 3);
        Teacher btea = new Teacher("Pavrd", 36, "1234567890", 5.0, 6, 12, 3);
        System.out.println(atea.getId() +"  ," + btea.getId()); //ID为系统自动更新生成，每添加一个老师，id默认加1.从1开始。
        btea.setId(1);
        System.out.println(atea.equals(btea)); //true,原因同上，id相同。

        StudentImmu Astuimmu = new StudentImmu(1, "Jack", "ABC", 12, 1, null);
        StudentImmu Bstuimmu = new StudentImmu(1, "Jack", "ABC", 24, 3, null);
        System.out.println(Astuimmu.equals(Bstuimmu)); //true 因为学生id和疫苗名称一样

        astu.addImmuRecord(Astuimmu);
        System.out.println(astu);
        astu.addImmuRecord(Bstuimmu); //此处将覆盖现有的有关 ABC 的疫苗记录，更新至最新后输入的这个记录。
        StudentImmu Cstuimmu = new StudentImmu(2, "Jack", "ABCDEFG", 24, 3, null);
        astu.addImmuRecord(Cstuimmu); //添加失败， 学生id不同
        Cstuimmu.setStuId(1);
        astu.addImmuRecord(Cstuimmu); //添加成功
        System.out.println("\n**********************************");
        //此时将有两条记录
        System.out.println(astu);

        System.out.println("\n**********************************");

        atea.setStuList(astu);
        atea.setStuList(bstu);//列表中还是一位学生，因为ab学生一样。前面check过，不能添加一样的学生。
        bstu.setId(2);
        System.out.println(atea);

        System.out.println("\n**********************************");
        bstu.setId(2);
        Student cstu = new Student("Jack", 12, "1234567890",3, "JJ", "addresssss", null);
        atea.setStuList(bstu);
        atea.setStuList(cstu);
        System.out.println(atea); //此次将有3项

        System.out.println("\n**********************************");
        Student dstu = new Student("Jack", 12, "1234567890", 5, "JJ", "addresssss", null);
        atea.setStuList(dstu);
        System.out.println(atea); //此次依然3项，因为capacity为3

        System.out.println("\nTest Factory**********************************");
        TeacherFactory tf = TeacherFactory.getInstance();
        StudentFactory sf = StudentFactory.getInstance();
        StudentImmuFactory sif = new StudentImmuFactory();

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(tf.getTeacher("Pavrd", 36, "1234567890", 5.0, 6, 12, 3));
        listPerson.add(sf.getStudent("Jack", 12, "1234567890", 3, "JJ", "addresssss", null));
        StudentImmu newStuImmu = sif.getStudentImmu(2, "Jack", "ABCDEFG", 24, 3, null);

        for(Person i: listPerson){
            System.out.println(i);
        }
        System.out.println("\n" + newStuImmu);



    }



}
