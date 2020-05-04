package com.codersbay.plakolb;

public class Assignment {

    private String name;
    private Integer maxPoints;
    private Integer pointsReached;

    //Constructor
    public Assignment(String name, Integer maxPoints, Integer pointsReached) {
        this.name = name;
        this.maxPoints = maxPoints;
        this.pointsReached = pointsReached;
    }

    //Getters and Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getMaxPoints() { return maxPoints; }

    public void setMaxPoints(Integer maxPoints) { this.maxPoints = maxPoints; }

    public Integer getPointsReached() { return pointsReached; }

    public void setPointsReached(Integer pointsReached) { this.pointsReached = pointsReached; }

    //other methods

    //isGraded


    //grade


    @Override
    public String toString() {
        return "Assignment{" +
                "name='" + name + '\'' +
                ", maxPoints=" + maxPoints +
                ", pointsReached=" + pointsReached +
                '}';
    }
}
