package com.example.second.controller;


import com.example.second.entity.Introduce;
import com.example.second.service.IntroduceService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/introduce")
@CrossOrigin(allowCredentials = "true")
public class IntroduceController {

    @Autowired
    private IntroduceService introduceService;

    @Autowired
    MenuService menuService;

    @GetMapping("/{id}")
    public Introduce FindById(@PathVariable Integer id){
        return  introduceService.FindById(id);
    }

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllIntroduces")
    public List<Introduce> findAllIntroduces() {
        return this.introduceService.findAllIntroduces();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addIntroduce")
    public void addIntroduce(@RequestBody Introduce introduce) {
        this.introduceService.addIntroduce(introduce);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteIntroduce")
    public void deleteIntroduceById(@RequestParam Long uid) {
        this.introduceService.deleteIntroduceById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateIntroduce")
    public void updateIntroduce(@RequestBody Introduce introduce) {
        this.introduceService.updateIntroduce(introduce);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findIntroduceByName")
    public List<Introduce> findIntroduceByName(@RequestParam String name) {
        return this.introduceService.findIntroduceByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteIntroducesByIds")
    public Integer deleteIntroducesByIds(Integer[] ids) {
        return this.introduceService.deleteIntroducesByIds(ids);
    }
}
