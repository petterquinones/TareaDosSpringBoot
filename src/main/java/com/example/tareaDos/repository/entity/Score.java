package com.example.tareaDos.repository.entity;

public class Score {
    private Integer id;
    private Integer qualification;
    private  Student student;
    private  Course course;

    public Score() {
    }

    public Score(Integer id, Integer qualification, Student student, Course course) {
        this.id = id;
        this.qualification = qualification;
        this.student = student;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQualification() {
        return qualification;
    }

    public void setQualification(Integer qualification) {
        this.qualification = qualification;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
