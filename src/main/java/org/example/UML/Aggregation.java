package org.example.UML;

import java.util.Arrays;
import java.util.List;

class Professor{

    private String name;

    public Professor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Department{

    private String name;

    private List<Professor> professors;

    public Department(String name, List<Professor> professors){
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors(){
        System.out.println("Department: " + name);
        for (Professor professor : professors){
            System.out.println(professor.getName());
        }
    }
}

public class Aggregation{
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr.Alice");
        Professor prof2 = new Professor("Dr.Bob");

        List<Professor> professors = Arrays.asList(prof1,prof2);
        Department department = new Department("Applied Mathematics", professors);

        department.showProfessors(); //Aggregation Relationship -> Department has professors, but professors exist independently
    }
}