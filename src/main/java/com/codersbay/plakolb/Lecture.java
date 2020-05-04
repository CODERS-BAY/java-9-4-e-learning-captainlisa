package com.codersbay.plakolb;

import java.util.ArrayList;

public class Lecture {

    private String name;
    private ArrayList<Assignment> listOfAssignments = new ArrayList<>();

    //Constructor
    public Lecture(String name) {
        this.name = name;
    }

    //Getters and Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public ArrayList<Assignment> getListOfAssignments() { return listOfAssignments; }

    //other methods

    //getGrade

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                '}';
    }
}

