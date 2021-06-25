package com.example.second.dao;

import com.example.second.entity.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "ClassesDao")
public interface ClassesDao {

    List<Classes> findAllClassess();

    int deleteClassesById(Long uid);

    int insert(Classes classes);

    int addClasses(Classes classes);

    Classes selectByPrimaryKey(Long uid);

    int updateClasses(Classes classes);

    int updateByPrimaryKey(Classes classes);

    List<Classes> findClassesByName(String name);

    Integer deleteClassessByIds(@Param("ids") Integer[] ids);

    int getCountClassess();
}
