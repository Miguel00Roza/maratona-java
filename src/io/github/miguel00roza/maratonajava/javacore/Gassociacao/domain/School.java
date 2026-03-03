package io.github.miguel00roza.maratonajava.javacore.Gassociacao.domain;

public class School {
    private String name;
    private Teacher[] teachers;

    public School(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        if (teachers != null) {
            System.out.println("Teachers:");
            for (Teacher teacher: teachers) {
                System.out.println(teacher.getName());
            }
        } else {
            System.out.println("There are no teachers at this school.");
            return;
        }
    }


    public School(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
