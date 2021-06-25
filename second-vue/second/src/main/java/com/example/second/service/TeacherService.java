package com.example.second.service;

import com.example.second.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TeacherService {
    void save(Teacher teacher);
    void add(Teacher teacher);
    void delete(Integer id);
    Teacher findById(Integer id);
    List<Teacher> findAllTeachers();
}
