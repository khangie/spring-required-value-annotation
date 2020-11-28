package com.seleniumexpress.loadfrompropertiesfile;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.interestedCourse}")
    private String interestedCourse;

    @Value("${student.hobby}")
    private String hobby;

//    @Value("${student.name}")
    public void setName(String name) {
        System.out.println("Setting name=" + name);
        this.name = name;
    }

//    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        System.out.println("Setting interestedCourse=" + interestedCourse);
        this.interestedCourse = interestedCourse;
    }

//    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        System.out.println("Setting hobby=" + hobby);
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("Student name: " + name + ", Interested course: " + interestedCourse + ", hobby: " + hobby);
    }

}
