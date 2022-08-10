package ru.logs.models;

import javax.persistence.Id;

public class Student {
    private int id;
    private String fullname;

    public Student() {
    }

    public Student(String fullname) {

        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
