package com.example.tareaDos.service.implement;

import com.example.tareaDos.dto.CourseDTO;
import com.example.tareaDos.repository.ICourseRepository;
import com.example.tareaDos.repository.entity.Course;
import com.example.tareaDos.service.ICourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImplement implements ICourseService {
    private final ICourseRepository repository;

    public CourseServiceImplement(ICourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(CourseDTO courseDTO) {
        if(!repository.existsById(courseDTO.getIdCourse())){
            repository.save(new Course(courseDTO));
        }
    }

    @Override
    public void update(CourseDTO courseDTO) {
        Optional<Course> course = repository.findById(courseDTO.getIdCourse());
        if (course.isPresent()){
            repository.save(new Course(courseDTO));
        }
    }

    @Override
    public void delete(Integer idCourse) {
        Optional<Course> course = repository.findById(idCourse);
        if (course.isPresent()){
            repository.deleteById(idCourse);
        }
    }

    @Override
    public List<CourseDTO> getAll() {
        List<Course> courses = (List<Course>) repository.findAll();
        return courses.stream()
                .map(course -> new CourseDTO(course))
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO findById(Integer idCourse) {
        Optional<Course> course = repository.findById(idCourse);
        return course.map(course1 -> new CourseDTO(course1)).orElse(null);
    }
}
