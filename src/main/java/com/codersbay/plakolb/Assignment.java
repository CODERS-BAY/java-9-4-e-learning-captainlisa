package com.codersbay.plakolb;

public class Assignment {

    private String name;
    private Integer maxPoints;
    private Integer pointsReached;

    //Constructor
    public Assignment(String name, Integer maxPoints) {
        this.name = name;
        this.maxPoints = maxPoints;
    }

    //Getters and Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getMaxPoints() { return maxPoints; }

    public void setMaxPoints(Integer maxPoints) { this.maxPoints = maxPoints; }

    public Integer getPointsReached() { return pointsReached; }

    public void setPointsReached(Integer pointsReached) { this.pointsReached = pointsReached; }


    //isGraded
    public boolean isGraded() {
        if (this.pointsReached == null) {
            return false;
        } else {
            return true;
        }
    }

    //grade
    public int grade(double points) {
        int graded;
        if (points > 0 && points <= (this.maxPoints * 0.5)) {
            graded = 5;
        } else if (points > (this.maxPoints * 0.5) && points <= (this.maxPoints * 0.65)) {
            graded = 4;
        } else if (points > (this.maxPoints * 0.65) && points <= (this.maxPoints * 0.8)) {
            graded = 3;
        } else if (points > (this.maxPoints * 0.8) && points <= (this.maxPoints * 0.9)) {
            graded = 2;
        } else if (points > (this.maxPoints * 0.9) && points <= this.maxPoints) {
            graded = 1;
        } else {
            graded = 0;
        }

        return graded;

    }


    @Override
    public String toString() {
        return "Assignment{" +
                "name='" + name + '\'' +
                ", maxPoints=" + maxPoints +
                ", pointsReached=" + pointsReached +
                '}';
    }
}
