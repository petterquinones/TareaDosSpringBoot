package com.example.tareaDos.service.implement;

import com.example.tareaDos.dto.TeacherDTO;
import com.example.tareaDos.repository.ITeacherRepository;
import com.example.tareaDos.repository.entity.Teacher;
import com.example.tareaDos.service.ITeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImplement implements ITeacherService {
    private final ITeacherRepository repository;

    public TeacherServiceImplement(ITeacherRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(TeacherDTO teacherDTO) {
        if(!repository.existsById(teacherDTO.getIdTeacher())){
            repository.save(new Teacher(teacherDTO));
        }
    }

    @Override
    public void update(TeacherDTO teacherDTO) {
        Optional<Teacher> teacher = repository.findById(teacherDTO.getIdTeacher());
        if (teacher.isPresent()){
            repository.save(new Teacher(teacherDTO));
        }

    }

    @Override
    public void delete(Integer idTeacher) {
        Optional<Teacher> teacher = repository.findById(idTeacher);
        if (teacher.isPresent()){
            repository.delete(teacher.get());
        }

    }

    @Override
    public List<TeacherDTO> getAll() {
        List<Teacher> teachers = (List<Teacher>)repository.findAll();
        return teachers.stream()
                .map(TeacherDTO::new)//teacher -> new TeacherDTO(teacher)
                .collect(Collectors.toList());
    }

    @Override
    public TeacherDTO findById(Integer idTeacher) {
        Optional<Teacher> teachers = repository.findById(idTeacher);
        return teachers.map(TeacherDTO::new).orElse(null); //t -> new TeacherDTO(t) Como hacer que retorne nulo
    }
}
