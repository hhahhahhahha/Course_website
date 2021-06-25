package com.example.second.service.impl;

import com.example.second.dao.TeamDao;
import com.example.second.entity.Team;
import com.example.second.service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeamServiceBean implements TeamService {
    @Resource
    TeamDao teamDao;
    @Override
    public Team FindById(Integer id){
        return teamDao.FindById(id);
    }
    @Override
    public void Update_team(Team team){
        teamDao.Update_team(team);
    }
}
