package com.example.second.controller;


import com.example.second.entity.Classes;
import com.example.second.service.ClassesService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
@CrossOrigin(allowCredentials = "true")
public class ClassesController {

    @Autowired
    private ClassesService classesService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllClassess")
    public List<Classes> findAllClassess() {
        return this.classesService.findAllClassess();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addClasses")
    public void addClasses(@RequestBody Classes classes) {
        this.classesService.addClasses(classes);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteClasses")
    public void deleteClassesById(@RequestParam Long uid) {
        this.classesService.deleteClassesById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateClasses")
    public void updateClasses(@RequestBody Classes classes) {
        this.classesService.updateClasses(classes);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findClassesByName")
    public List<Classes> findClassesByName(@RequestParam String name) {
        return this.classesService.findClassesByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteClassessByIds")
    public Integer deleteClassessByIds(Integer[] ids) {
        return this.classesService.deleteClassessByIds(ids);
    }
}
