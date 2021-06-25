package com.example.second.controller;


import com.example.second.entity.Link;
import com.example.second.service.LinkService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/link")
@CrossOrigin(allowCredentials = "true")
public class LinkController {

    @Autowired
    private LinkService linkService;

    @Autowired
    MenuService menuService;

    @GetMapping("/{id}")
    public Link FindById(@PathVariable Integer id){
        return  linkService.FindById(id);
    }

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllLinks")
    public List<Link> findAllLinks() {
        return this.linkService.findAllLinks();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addLink")
    public void addLink(@RequestBody Link link) {
        this.linkService.addLink(link);
    }

    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteLink")
    public void deleteLinkById(@RequestParam Long uid) {
        this.linkService.deleteLinkById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateLink")
    public void updateLink(@RequestBody Link link) {
        this.linkService.updateLink(link);
    }

    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findLinkByName")
    public List<Link> findLinkByName(@RequestParam String name) {
        return this.linkService.findLinkByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteLinksByIds")
    public Integer deleteLinksByIds(Integer[] ids) {
        return this.linkService.deleteLinksByIds(ids);
    }
}
