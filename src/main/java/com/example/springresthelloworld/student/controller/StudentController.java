package com.example.springresthelloworld.student.controller;

import com.example.springresthelloworld.student.dto.StudentDTO;
import com.example.springresthelloworld.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody StudentDTO dto) {
        return ResponseEntity.ok(studentService.create(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getId(@PathVariable("id") String id) {
        return ResponseEntity.ok(studentService.getStudentName(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody StudentDTO studentDTO, @PathVariable String id) {
        return ResponseEntity.ok(studentService.update(studentDTO, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        return ResponseEntity.ok(studentService.delete(id));
    }


}
