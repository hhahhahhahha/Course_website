package com.example.second.controller;


import com.example.second.entity.Majors;
import com.example.second.service.MajorsService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/majors")
@CrossOrigin(allowCredentials = "true")
public class MajorsController {

    @Autowired
    private MajorsService majorsService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllMajorss")
    public List<Majors> findAllMajorss() {
        return this.majorsService.findAllMajorss();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addMajors")
    public void addMajors(@RequestBody Majors majors) {
        this.majorsService.addMajors(majors);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteMajors")
    public void deleteMajorsById(@RequestParam Long uid) {
        this.majorsService.deleteMajorsById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateMajors")
    public void updateMajors(@RequestBody Majors majors) {
        this.majorsService.updateMajors(majors);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findMajorsByName")
    public List<Majors> findMajorsByName(@RequestParam String name) {
        return this.majorsService.findMajorsByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteMajorssByIds")
    public Integer deleteMajorssByIds(Integer[] ids) {
        return this.majorsService.deleteMajorssByIds(ids);
    }
}
