package com.hillel.javaintroduction.homework9;

public class Student {

    private String name;
    private int studyYear;
    private String faculty;

    public static int nameCounter = 0;
    public static int facultyCounter = 0;

    public Student() {
        this.name = name;
        this.studyYear = studyYear;
    }

    public String getName() {
        nameCounter++;
        return name;
    }

    public void setName() {
        System.out.printf("Was: %s and become %s\n", this.name, name);
        this.name = name;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public String getFaculty() {
        facultyCounter++;
        return faculty;
    }

    public void setFaculty() {
        System.out.printf("Was: %s and become %s\n", this.faculty, faculty);
        this.faculty = faculty;
    }

}
