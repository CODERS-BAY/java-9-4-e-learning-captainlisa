package com.codersbay.plakolb;

import org.graalvm.compiler.phases.common.inlining.info.AssumptionInlineInfo;

public class Main {

    public static void main(String[] args){

        //create Assignments
        Assignment midterm = new Assignment("midterm", 100);
        Assignment termpaper = new Assignment("termpaper", 100);
        Assignment homeworkOne = new Assignment("homeworkOne", 100);
        Assignment finalProject = new Assignment("finalProject", 100);
        Assignment finalexam = new Assignment("finalExam", 150);

        //use methods with Assignments
        System.out.println(midterm.grade(76));
        System.out.println(midterm.getGrade());
        System.out.println(midterm.getPointsReached());
        System.out.println(midterm.isGraded());
        System.out.println(termpaper.grade(63));
        System.out.println(finalProject.grade(94));
        System.out.println(finalProject.isGraded());
        System.out.println(homeworkOne.grade(76));
        System.out.println(finalexam.grade(127));

        //create Lectures
        Lecture lectureOne = new Lecture("Astronomy");
        Lecture lectureTwo = new Lecture("Muggle Studies");
        Lecture lectureThree = new Lecture("Care of Magical Creatures");
        Lecture lectureFour = new Lecture("Potions");
        Lecture lectureFive = new Lecture("Transfiguration");
        Lecture lectureSix = new Lecture("Charms");
        Lecture lectureSeven = new Lecture("Defence Against the Dark Arts");
        Lecture lectureEight = new Lecture("Herbology");

        //use methods with Lectures
        lectureOne.addAssignment(midterm);
        lectureOne.addAssignment(termpaper);
        lectureOne.addAssignment(homeworkOne);
        lectureOne.addAssignment(finalexam);
        lectureOne.addAssignment(finalProject);
        lectureTwo.addAssignment(midterm);
        lectureTwo.addAssignment(finalexam);
        lectureThree.addAssignment(finalexam);
        lectureFour.addAssignment(finalexam);
        lectureFive.addAssignment(finalexam);
        lectureSix.addAssignment(finalexam);
        lectureSeven.addAssignment(finalexam);
        lectureEight.addAssignment(finalexam);
        lectureThree.addAssignment(homeworkOne);
        lectureFour.addAssignment(midterm);
        lectureSeven.addAssignment(midterm);
        lectureSeven.addAssignment(termpaper);

        System.out.println(lectureOne.getFinalGrade());

        //create Students
        Student hermione =  new Student("Hermione Granger", 7507);
        Student harry =  new Student("Harry Potter", 4862);
        Student ron =  new Student("Ronald Weasley", 9941);
        Student luna =  new Student("Luna Lovegood", 1470);
        Student ginny =  new Student("Ginny Weasley", 4873);

        //use methods with students
        hermione.enroll(lectureOne);
        hermione.enroll(lectureTwo);
        hermione.enroll(lectureThree);
        hermione.enroll(lectureFour);
        hermione.enroll(lectureFive);
        hermione.enroll(lectureSix);
        hermione.enroll(lectureSeven);
        hermione.enroll(lectureEight);
        harry.enroll(lectureSix);
        harry.enroll(lectureThree);
        harry.enroll(lectureEight);
        ron.enroll(lectureSeven);
        ron.enroll(lectureSix);
        luna.enroll(lectureEight);
        luna.enroll(lectureOne);
        ginny.enroll(lectureSix);

        System.out.println(hermione.getEnrolledLectures());
        hermione.getSchoolReport();



    }
}
