package com.emrehoruzoglu;

import com.emrehoruzoglu.model.Course;

public class Main {

    public static void main(String[] args) {
        Course course1 =new Course(1235979,"YAZILIM GELİŞTİRİCİ YETİŞTİRME KAMPI c#","ENGİN DEMİROG",".JPG1232324");
        Course course2 =new Course(1332369,"YAZILIM GELİŞTİRİCİ YETİŞTİRME KAMPI JAVA","ENGİN DEMİROG",".JPG12321");
        Course course3 =new Course(1240541,"PROGRAMLAMAYA GİRİŞ İÇİN TEMEL KURS","ENGİN DEMİROG", ".JPG5779589");

        Course[] courses=  {course1,course2,course3};
        System.out.println(courses.length);
        for(Course course:courses){
            System.out.println(course.getCourseName());
            System.out.println(course.getId());
            System.out.println(course.getTeacherName());
            System.out.println(course.getCourseImageUrl());
        }



    }
}