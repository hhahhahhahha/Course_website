package com.example.second.service.impl;

import com.example.second.dao.DepartmentDao;
import com.example.second.entity.Department;
import com.example.second.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceBean implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;


    public List<Department> findAllDepartments() {
        return this.departmentDao.findAllDepartments();
    }


    @Transactional
    public void addDepartment(Department department) {
        this.departmentDao.addDepartment(department);
//        this.departmentCopyDao.addDepartment(department);
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
    }
    public Department FindById(Integer id){
        return departmentDao.FindById(id);
    };
    public void deleteDepartmentById(Long uid) {
        this.departmentDao.deleteDepartmentById(uid);
    }

    public void updateDepartment(Department department) {
        this.departmentDao.updateDepartment(department);
    }

    public List<Department> findDepartmentByName(String name) {
        return this.departmentDao.findDepartmentByName(name);
    }

    public Integer deleteDepartmentsByIds(Integer[] ids) {
        return this.departmentDao.deleteDepartmentsByIds(ids);
    }

}
