package com.emrehoruzoglu.model;

public class Course {
    private int id;
    private String courseName;
    private String teacherName;
    private String courseImageUrl;

    public Course() {
    }

    public Course(int id, String courseName, String teacherName, String courseImageUrl) {
        this.id = id;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseImageUrl = courseImageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseImageUrl() {
        return courseImageUrl;
    }

    public void setCourseImageUrl(String courseImageUrl) {
        this.courseImageUrl = courseImageUrl;
    }
}
