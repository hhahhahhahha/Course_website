package com.example.second.dao;

import com.example.second.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "TeacherDao")
public interface TeacherDao {
    void save(Teacher teacher);
    void add(Teacher student);
    void delete(Integer id);
    Teacher findById(Integer id);
    List<Teacher> findAllTeachers() ;
}
