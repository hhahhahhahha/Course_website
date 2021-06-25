package com.example.second.controller;


import com.example.second.entity.Department;
import com.example.second.service.DepartmentService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin(allowCredentials = "true")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    MenuService menuService;

    @GetMapping("/{id}")
    public Department FindById(@PathVariable Integer id){
        return  departmentService.FindById(id);
    }

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllDepartments")
    public List<Department> findAllDepartments() {
        return this.departmentService.findAllDepartments();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addDepartment")
    public void addDepartment(@RequestBody Department department) {
        this.departmentService.addDepartment(department);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteDepartment")
    public void deleteDepartmentById(@RequestParam Long uid) {
        this.departmentService.deleteDepartmentById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateDepartment")
    public void updateDepartment(@RequestBody Department department) {
        this.departmentService.updateDepartment(department);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findDepartmentByName")
    public List<Department> findDepartmentByName(@RequestParam String name) {
        return this.departmentService.findDepartmentByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteDepartmentsByIds")
    public Integer deleteDepartmentsByIds(Integer[] ids) {
        return this.departmentService.deleteDepartmentsByIds(ids);
    }
}
