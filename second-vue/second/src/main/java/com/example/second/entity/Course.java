package com.example.second.entity;

public class Course {
    private String id;
    private String name;
    private String teacher;
    private String term;
    private String accomadation;
    private Integer num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAccomadation() {
        return accomadation;
    }

    public void setAccomadation(String accomadation) {
        this.accomadation = accomadation;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", term='" + term + '\'' +
                ", accomadation='" + accomadation + '\'' +
                ", num=" + num +
                '}';
    }
}
