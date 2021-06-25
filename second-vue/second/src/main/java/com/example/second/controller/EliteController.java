package com.example.second.controller;


import com.example.second.entity.Elite;
import com.example.second.service.EliteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/elite")
public class EliteController {
    @Resource
    private EliteService eliteService;
    //    @GetMapping("/page")
//    public Result<Page<Student>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
//                                          @RequestParam(defaultValue = "10") Integer pageSize) {
//        return Result.success(studentService.findPage(pageNum,pageSize));
//    }
    @GetMapping("/{id}")
    private Elite findById(@PathVariable Integer id) {
        return eliteService.findById(id);
        //return Result.success();
    }
    @GetMapping
    public List<Elite> findAll() {
        return eliteService.findAllElites();
    }

    @PostMapping
    public void personAdd(@RequestBody Elite elite) {
        //return  Result.success();
        eliteService.add(elite);
    }
    @DeleteMapping("/{id}")
    public void persondel(@PathVariable Integer id) {
        //studentService.delete(id);
        //return  Result.success();
        eliteService.delete(id);
    }
    @PutMapping
    public void personUpdate(@RequestBody Elite elite) {
        //return Result.success();
        eliteService.save(elite);
    }
}
