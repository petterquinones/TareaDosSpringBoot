package com.example.tareaDos.repository.entity;

import com.example.tareaDos.dto.TeacherDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    private Integer identificationTeacher;
    @Column(name="NAME_TEACHER", nullable = false)
    private String nameTeacher;
    @Column(name ="LASTNAME_TEACHER", nullable = false)
    private String lastNameTeacher;
    @Column(name="AGE-TEACHER")
    private Integer ageTeacher;

    public Teacher() {
    }

    public Integer getIdentificationTeacher() {
        return identificationTeacher;
    }

    public void setIdentificationTeacher(Integer identificationTeacher) {
        this.identificationTeacher = identificationTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public Integer getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(Integer ageTeacher) {
        this.ageTeacher = ageTeacher;
    }

    public Teacher(TeacherDTO teacherDTO){
        this.identificationTeacher = teacherDTO.getIdentificationTeacher();
        this.nameTeacher = teacherDTO.getNameTeacher();
        this.lastNameTeacher = teacherDTO.getLastNameTeacher();
        this.ageTeacher = teacherDTO.getAgeTeacher();
        //Falta course
    }
}


//**PENDIENTE
// Falta agregar course
// Este no se encuentra recordar que este no esta en getter y setter
// tampoco se encuentra en el constructor
// */