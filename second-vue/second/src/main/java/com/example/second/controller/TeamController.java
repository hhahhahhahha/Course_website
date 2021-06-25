package com.example.second.controller;

import com.example.second.entity.Team;
import com.example.second.service.TeamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Resource
    TeamService teamService;

    @GetMapping("/{id}")
    public Team FindById(@PathVariable Integer id){
        return  teamService.FindById(id);
    }
    @PostMapping("/update")
    public void Update_team(@RequestBody Team team){
        teamService.Update_team(team);
    }
}
