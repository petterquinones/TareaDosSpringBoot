package com.example.tareaDos.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id private Integer identification;
    @Column(name="NAME_TEACHER", nullable = false) private String name;
    @Column(name ="LASTNAME_TEACHER", nullable = false) private String lastName;
    @Column(name="AGE") private Integer age;

    public Teacher() {
    }

    public Teacher(Integer identification, String name, String lastName, Integer age) {
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getIdentification() {
        return identification;
    }

    public void setIdentification(Integer identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


//**PENDIENTE
// Falta agregar course
// Este no se encuentra recordar que este no esta en getter y setter
// tampoco se encuentra en el constructor
// */