package com.example.tareaDos.dto;

public class ScoreDTO {

    private Integer id;
    private Integer qualification;
    private StudentDTO studentDTO;
    private CourseDTO courseDTO;

    public ScoreDTO() {
    }

    public ScoreDTO(Integer id, Integer qualification, StudentDTO studentDTO, CourseDTO courseDTO) {
        this.id = id;
        this.qualification = qualification;
        this.studentDTO = studentDTO;
        this.courseDTO = courseDTO;
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

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }
}
