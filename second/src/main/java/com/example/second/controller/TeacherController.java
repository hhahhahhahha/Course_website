package com.example.second.controller;


import com.example.second.entity.Teacher;
import com.example.second.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
//    @GetMapping("/page")
//    public Result<Page<Student>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
//                                          @RequestParam(defaultValue = "10") Integer pageSize) {
//        return Result.success(studentService.findPage(pageNum,pageSize));
//    }
    @GetMapping("/{id}")
    private Teacher findById(@PathVariable Integer id) {
        return teacherService.findById(id);
        //return Result.success();
    }
    @GetMapping
    public List<Teacher> findAll() {
        return teacherService.findAllTeachers();
    }

    @PostMapping
    public void personAdd(@RequestBody Teacher teacher) {
        //return  Result.success();
        teacherService.add(teacher);
    }
    @DeleteMapping("/{id}")
    public void persondel(@PathVariable Integer id) {
        //studentService.delete(id);
        //return  Result.success();
        teacherService.delete(id);
    }
    @PutMapping
    public void personUpdate(@RequestBody Teacher teacher) {
        //return Result.success();
        teacherService.save(teacher);
    }
}
