package com.emrehoruzoglu.gun2odev1.model;

public class Course {
    public int id;
    public String courseName;
    public String teacherName;
    public String courseImageUrl;

    public Course() {
    }

    public Course(int id, String courseName, String teacherName, String courseImageUrl) {
        this.id = id;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseImageUrl = courseImageUrl;
    }

}
