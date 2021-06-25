package com.example.second.controller;


import com.example.second.entity.Answer;
import com.example.second.service.AnswerService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answer")
@CrossOrigin(allowCredentials = "true")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    MenuService menuService;

    @GetMapping("/{id}")
    public Answer FindById(@PathVariable Integer id){
        return  answerService.FindById(id);
    }

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllAnswers")
    public List<Answer> findAllAnswers() {
        return this.answerService.findAllAnswers();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addAnswer")
    public void addAnswer(@RequestBody Answer answer) {
        this.answerService.addAnswer(answer);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteAnswer")
    public void deleteAnswerById(@RequestParam Long uid) {
        this.answerService.deleteAnswerById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateAnswer")
    public void updateAnswer(@RequestBody Answer answer) {
        this.answerService.updateAnswer(answer);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findAnswerByName")
    public List<Answer> findAnswerByName(@RequestParam String name) {
        return this.answerService.findAnswerByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteAnswersByIds")
    public Integer deleteAnswersByIds(Integer[] ids) {
        return this.answerService.deleteAnswersByIds(ids);
    }
}
