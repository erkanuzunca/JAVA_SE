package oop.abstractx;

abstract public class MainAbstract {

    public static void main(String[] args) {

        // Person person=new Person(); yazılamaz

        Person person=new Teacher();//polymorphism
        person.setId(55L);
        person.setName("person1 name: ");
        person.setSurname("person1 surname: ");
        // System.out.println("******GETDATA*****");
        person.getData();//polymorphism
        person.govdesizMethod();
        System.out.println(person.hashCode());
        System.out.println(person);


        System.out.println("************************");
        Teacher teacher=new Teacher();
        teacher.setId(44L);
        teacher.setName("Teacher1 name: ");
        teacher.setSurname("teacher1 surname: ");
        // System.out.println("******GETDATA*****");
        teacher.getData();
        teacher.govdesizMethod();
        System.out.println(teacher.hashCode());
        System.out.println(teacher);


        System.out.println("***********************");
        Student student=new Student();
        student.setId(23L);
        student.setName("student1 name: ");
        student.setSurname("student1 surname: ");
        //System.out.println("******GETDATA*****");
        student.getData();
        student.govdesizMethod();
        System.out.println(student.hashCode());
        System.out.println(student);
    }


}
