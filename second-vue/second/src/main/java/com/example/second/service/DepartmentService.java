package com.example.second.service;

import com.example.second.entity.Department;

import java.util.List;


public interface DepartmentService {

    public List<Department> findAllDepartments();
    
    Department FindById(Integer id);

    public void addDepartment(Department department);

    public void deleteDepartmentById(Long uid);

    public void updateDepartment(Department department);

    List<Department> findDepartmentByName(String name);

    public Integer deleteDepartmentsByIds(Integer[] ids);
}
