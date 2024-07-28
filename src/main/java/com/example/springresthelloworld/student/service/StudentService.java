package com.example.springresthelloworld.student.service;

import com.example.springresthelloworld.student.dto.StudentDTO;
import com.example.springresthelloworld.student.exp.AppBadException;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private final List<StudentDTO> students = new LinkedList<>();

    public StudentDTO getStudentName(String id) {
        for (StudentDTO student : students) {
            if (student.getUUID().equals(id)) {
                return student;
            }
        }
        throw new AppBadException(" bunaqa nomli student topilmadi!");
    }


    public StudentDTO create(StudentDTO dto) {
        dto.setUUID(UUID.randomUUID().toString());
        students.add(dto);
        return dto;
    }

    public StudentDTO update(StudentDTO student, String id) {
        StudentDTO newStudent = new StudentDTO();
        for (StudentDTO studentDTO : students) {
            if (studentDTO.getUUID().equals(id)) {
                newStudent.setUUID(student.getUUID());
                newStudent.setName(student.getName());
                newStudent.setAge(student.getAge());
                return newStudent;
            }
        }
        throw new AppBadException("bunaqa student topilmadi!");
    }

    public boolean delete(String id) {
        for (StudentDTO student : students) {
            if (student.getUUID().equals(id)) {
                return students.remove(student);
            }
        }
        throw new AppBadException("bunday user topilmadi!");
    }
}
