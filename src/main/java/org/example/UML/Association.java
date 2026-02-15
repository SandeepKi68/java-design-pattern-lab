package org.example.UML;

record Teacher(String name) {

    public void teach(Student student) {
        System.out.println(name + " is teaching " + student.name());
    }
}

record Student(String name) {}
public class Association{
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Alice");
        Student student = new Student("Bob");

        teacher.teach(student); //Association b/w teacher and student
    }
}