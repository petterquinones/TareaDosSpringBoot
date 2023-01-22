package com.example.tareaDos.dto;

import com.example.tareaDos.repository.entity.Student;

import java.util.Date;

public class StudentDTO {
    private Integer IdStudent;
    private String nameStudent;
    private String lasNameStudent;
    private Date dateOfBirth;

    public StudentDTO() {
    }

    public StudentDTO(Integer idStudent, String nameStudent, String lasNameStudent, Date dateOfBirth) {
        IdStudent = idStudent;
        this.nameStudent = nameStudent;
        this.lasNameStudent = lasNameStudent;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(Integer idStudent) {
        IdStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLasNameStudent() {
        return lasNameStudent;
    }

    public void setLasNameStudent(String lasNameStudent) {
        this.lasNameStudent = lasNameStudent;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public StudentDTO(Student student) {
        this.IdStudent = student.getIdStudent();
        this.nameStudent = student.getNameStudent();
        this.lasNameStudent = student.getLasNameStudent();
        this.dateOfBirth = student.getDateOfBirth();

    }

}
