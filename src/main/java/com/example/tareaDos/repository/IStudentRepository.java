package com.example.tareaDos.repository;

import com.example.tareaDos.repository.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student,Integer> {
}
