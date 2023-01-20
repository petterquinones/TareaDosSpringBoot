package com.example.tareaDos.dto;

import com.example.tareaDos.repository.entity.Teacher;

import java.util.List;

public class TeacherDTO {
    private Integer identificationTeacher;
    private String nameTeacher;
    private String lastNameTeacher;
    private Integer ageTeacher;
    private List<CourseDTO> courseDTOListTeacher;

    public List<CourseDTO> getCourseDTOListTeacher() {
        return courseDTOListTeacher;
    }

    public void setCourseDTOListTeacher(List<CourseDTO> courseDTOListTeacher) {
        this.courseDTOListTeacher = courseDTOListTeacher;
    }

    public TeacherDTO() {
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

    public TeacherDTO(Teacher teacher){
        this.identificationTeacher = teacher.getIdentificationTeacher();
        this.nameTeacher = teacher.getNameTeacher();
        this.lastNameTeacher = teacher.getLastNameTeacher();
        this.ageTeacher = this.getAgeTeacher();
        //Faltá course
    }

}
