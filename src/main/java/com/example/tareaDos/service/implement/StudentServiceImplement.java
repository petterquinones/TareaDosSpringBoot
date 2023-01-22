package com.example.tareaDos.service.implement;

import com.example.tareaDos.dto.StudentDTO;
import com.example.tareaDos.repository.IStudentRepository;
import com.example.tareaDos.repository.entity.Student;
import com.example.tareaDos.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImplement implements IStudentService {
    private final IStudentRepository repository;

    public StudentServiceImplement(IStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(StudentDTO studentDTO) {
        if(!repository.existsById(studentDTO.getIdStudent())){
            repository.save(new Student(studentDTO));
        }

    }

    @Override
    public void update(StudentDTO studentDTO) {
        Optional<Student> student = repository.findById(studentDTO.getIdStudent());
        if(student.isPresent()){
            repository.save(new Student(studentDTO));
        }
    }

    @Override
    public void delete(Integer idStudent) {
        Optional<Student> student = repository.findById(idStudent);
        if(student.isPresent()){
            repository.delete(student.get());
        }
    }

    @Override
    public List<StudentDTO> getAll() {
        List<Student> students = (List<Student>) repository.findAll();
        return students.stream()
                .map(StudentDTO::new)//(student-> new StudentDTO(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO findById(Integer idStudent) {
        Optional<Student> students = repository.findById(idStudent);
        return  students.map(StudentDTO::new).orElse(null);

    }
}
