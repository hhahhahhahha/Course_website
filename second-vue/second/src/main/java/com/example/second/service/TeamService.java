package com.example.second.service;

import com.example.second.entity.Team;

public interface TeamService {
    Team FindById(Integer id);
    void Update_team(Team team);
}
