package com.example.second.service;

import com.example.second.entity.Classes;

import java.util.List;


public interface ClassesService {

    public List<Classes> findAllClassess();

    public void addClasses(Classes classes);

    public void deleteClassesById(Long uid);

    public void updateClasses(Classes classes);

    List<Classes> findClassesByName(String name);

    public Integer deleteClassessByIds(Integer[] ids);
}
