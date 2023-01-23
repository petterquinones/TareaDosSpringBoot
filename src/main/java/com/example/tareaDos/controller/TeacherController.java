package com.example.tareaDos.controller;

import com.example.tareaDos.dto.TeacherDTO;
import com.example.tareaDos.service.ITeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final ITeacherService service;

    public TeacherController(ITeacherService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<?> getAll(){
        return ResponseEntity
                .ok()
                .body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Integer idTeacher){
        return ResponseEntity
                .ok()
                .body(service.findById(idTeacher));
    }
    @PostMapping()
    public ResponseEntity<?>save(@Valid @RequestBody TeacherDTO teacherDTO){
        service.save(teacherDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
