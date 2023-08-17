package oop.inheritancex;

public class MainInheritance {

    public static void main(String[] args) {

        Teacher teacher=new Teacher();
        teacher.setId(44L);
        teacher.setName("Teacher1 name: ");
        teacher.setSurname("teacher1 surname: ");
       // System.out.println("******GETDATA*****");
        teacher.getData();
        System.out.println(teacher.hashCode());
        System.out.println(teacher);


        System.out.println("***********************");
        Student student=new Student();
        student.setId(23L);
        student.setName("student1 name: ");
        student.setSurname("student1 surname: ");
        //System.out.println("******GETDATA*****");
        student.getData();
        System.out.println(student.hashCode());
        System.out.println(student);
    }


}
