package com.example.second.controller;

import com.example.second.entity.Res;
import com.example.second.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/res")
public class ResController {
    @Resource
    ResService dataService;
    @GetMapping("/{id}")
    public List<Res> FindById(@PathVariable Integer id){
        return  dataService.FindById(id);
    }
    @PutMapping("/update")
    public void Update_data(@RequestBody Res data){
        dataService.Update_data(data);
    }
}
