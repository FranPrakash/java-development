package com.pluralsight;

public class Course {

  private String title;
  private int numberOfStudyPoints;
  private int maxNumberOfStudents;

  //Constructor
    public Course(int maxNumberOfStudents, int numberOfStudyPoints, String title) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.numberOfStudyPoints = numberOfStudyPoints;
        this.title = title;
    }

    //Getters and Setters
    public int getNumberOfStudyPoints() {
        return numberOfStudyPoints;
    }

    public void setNumberOfStudyPoints(int numberOfStudyPoints) {
        this.numberOfStudyPoints = numberOfStudyPoints;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
