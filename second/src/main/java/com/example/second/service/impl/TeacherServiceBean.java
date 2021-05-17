package com.example.second.service.impl;

import com.example.second.dao.TeacherDao;
import com.example.second.entity.Teacher;
import com.example.second.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceBean implements TeacherService {
    @Resource
    TeacherDao teacherDao;
    @Override
    public void save(Teacher teacher){
        teacherDao.save(teacher);
    };
    @Override
    public void add(Teacher teacher){
        teacherDao.add(teacher);
    };
    @Override
    public void delete(Integer id){
        teacherDao.delete(id);
    };
    @Override
    public Teacher findById(Integer id){
        return teacherDao.findById(id);
    };
    @Override
    public List<Teacher> findAllTeachers(){
        return teacherDao.findAllTeachers();
    };
}
