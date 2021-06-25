package com.example.second.dao;

import com.example.second.entity.Majors;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "MajorsDao")
public interface MajorsDao {

    List<Majors> findAllMajorss();

    int deleteMajorsById(Long uid);

    int insert(Majors majors);

    int addMajors(Majors majors);

    Majors selectByPrimaryKey(Long uid);

    int updateMajors(Majors majors);

    int updateByPrimaryKey(Majors majors);

    List<Majors> findMajorsByName(String name);

    Integer deleteMajorssByIds(@Param("ids") Integer[] ids);

    int getCountMajorss();
}
