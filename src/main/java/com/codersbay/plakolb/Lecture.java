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

    //addAssignment
    public void addAssignment (Assignment assignment) {
        this.listOfAssignments.add(assignment);
    }

    //getGrade
    public Integer getFinalGrade () {
        int finalGrade = 0;
        int grade;
        double sumOfGrades = 0;
        ArrayList<Integer> listOfGrades = new ArrayList<>();

        for (Assignment assignment : this.listOfAssignments) {
            if (assignment.isGraded() == true) {
                grade = assignment.getGrade();
                listOfGrades.add(grade);
            }
        }

        for (double gradeValue : listOfGrades) {
            sumOfGrades = sumOfGrades + gradeValue;
        }

        finalGrade = (int)Math.round(sumOfGrades / listOfGrades.size());
        if (finalGrade == 0) {
            return null;
        } else {
            return finalGrade;
        }

    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                '}';
    }
}

