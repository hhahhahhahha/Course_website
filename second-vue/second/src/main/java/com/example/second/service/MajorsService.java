package com.example.second.service;

import com.example.second.entity.Majors;

import java.util.List;


public interface MajorsService {

    public List<Majors> findAllMajorss();

    public void addMajors(Majors majors);

    public void deleteMajorsById(Long uid);

    public void updateMajors(Majors majors);

    List<Majors> findMajorsByName(String name);

    public Integer deleteMajorssByIds(Integer[] ids);
}
