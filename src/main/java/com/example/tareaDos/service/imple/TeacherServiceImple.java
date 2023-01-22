//package com.example.tareaDos.service.imple;
//
//import com.example.tareaDos.dto.TeacherDTO;
////import com.example.tareaDos.repository.ITeacherRepository;
//import com.example.tareaDos.repository.entity.Teacher;
//import com.example.tareaDos.service.ITeacherService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
////@Service
//public class TeacherServiceImple implements ITeacherService {
//    private final ITeacherRepository repository;
//
//    public TeacherServiceImple(ITeacherRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void save(TeacherDTO teacherDTO) {
//        if(repository.existsById(teacherDTO.getIdTeacher())){
//            repository.save(new Teacher(teacherDTO));
//        }
//
//    }
//
//    @Override
//    public List<TeacherDTO> getAll() {
//        return null;
//    }
//
//    @Override
//    public void update(TeacherDTO teacherDTO) {
//
//    }
//
//    @Override
//    public void delete(Integer idTeacher) {
//
//    }
//
//    @Override
//    public TeacherDTO findById(Integer idTeacher) {
//        return null;
//    }
//}
