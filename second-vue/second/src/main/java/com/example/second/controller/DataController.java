package com.example.second.controller;

import com.example.second.entity.Data;
import com.example.second.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {
    @Resource
    DataService dataService;
    @GetMapping("/{id}")
    public List<Data> FindById(@PathVariable Integer id){
        return  dataService.FindById(id);
    }
    @PutMapping("/update")
    public void Update_data(@RequestBody Data data){
        dataService.Update_data(data);
    }
}
