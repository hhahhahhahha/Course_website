package com.example.second.dao;

import com.example.second.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "DepartmentDao")
public interface DepartmentDao {
    Department FindById(Integer id);
    List<Department> findAllDepartments();

    int deleteDepartmentById(Long uid);

    int insert(Department department);

    int addDepartment(Department department);

    Department selectByPrimaryKey(Long uid);

    int updateDepartment(Department department);

    int updateByPrimaryKey(Department department);

    List<Department> findDepartmentByName(String name);

    Integer deleteDepartmentsByIds(@Param("ids") Integer[] ids);

    int getCountDepartments();
}
