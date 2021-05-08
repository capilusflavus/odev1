package com.emrehoruzoglu.gun2odev1.odev;

import com.emrehoruzoglu.gun2odev1.model.Category;
import com.emrehoruzoglu.gun2odev1.model.Course;
import com.emrehoruzoglu.gun2odev1.service.ProductManager;

public class Main {
    public static void main(String[] args) {
        Course course1 =new Course(1235979,"YAZILIM GELİŞTİRİCİ YETİŞTİRME KAMPI c#","ENGİN DEMİROG",".JPG1232324");
        Course course2 =new Course(1332369,"YAZILIM GELİŞTİRİCİ YETİŞTİRME KAMPI JAVA","ENGİN DEMİROG",".JPG12321");
        Course course3 =new Course(1240541,"PROGRAMLAMAYA GİRİŞ İÇİN TEMEL KURS","ENGİN DEMİROG", ".JPG5779589");

        Course[] courses=  {course1,course2,course3};
        System.out.println(courses.length);
        for(Course course:courses){
            System.out.println(course.id);
            System.out.println(course.courseName);
            System.out.println(course.teacherName);
            System.out.println(course.courseImageUrl);
        }
        Category category1 = new Category("kurslarım",1);
        Category category2 = new Category("Tüm Kurslar",2);
        Category catecory3 = new Category("Kampa Hazırlık",3);
        Category category4 = new Category("Sık Sorulan Sorular",4);
        Category[] catocories = {category1, category2,catecory3, category4};
        System.out.println(catocories.length);
        for (Category category :catocories){
            System.out.println(category.name);
            System.out.println(category.no);
        }
        ProductManager productManager=new ProductManager();
        productManager.addToCart();
    }

}