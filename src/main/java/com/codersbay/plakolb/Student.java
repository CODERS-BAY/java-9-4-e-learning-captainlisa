package com.codersbay.plakolb;

import java.util.ArrayList;

public class Student {

    private String name;
    private Integer matriculationNumber;
    private ArrayList<Lecture> enrolledLectures = new ArrayList<>();

    //Constructor
    public Student(String name, Integer matriculationNumber) {
        this.name = name;
        this.matriculationNumber = matriculationNumber;
    }

    //Getters and Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getMatriculationNumber() { return matriculationNumber; }

    public void setMatriculationNumber(Integer matriculationNumber) { this.matriculationNumber = matriculationNumber; }

    public ArrayList<Lecture> getEnrolledLectures() { return enrolledLectures; }

    //other methods

    //enroll

    //getSchoolReport


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", matriculationNumber=" + matriculationNumber +
                '}';
    }
}
