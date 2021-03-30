package com.example.asynctask;

import java.util.ArrayList;

public class StudentDao {

    private ArrayList<Student> studentInfo = new ArrayList<Student>();

    public void Student(){
        studentInfo.add(new Student("Haines", "Emily", "CITA"));
        studentInfo.add(new Student("Benry", "Benry", "Game Design"));
        studentInfo.add(new Student("Ramsay", "Gordon", "Culinary Arts"));
        studentInfo.add(new Student("Taffer", "Jon", "Psychology"));
        studentInfo.add(new Student("Bean", "Green", "Biology"));
    }

    public ArrayList getAllStudents(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentInfo;
    }

}
