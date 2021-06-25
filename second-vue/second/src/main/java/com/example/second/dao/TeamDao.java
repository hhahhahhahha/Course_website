package com.example.second.dao;

import com.example.second.entity.Team;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "TeamDao")
public interface TeamDao {
    Team FindById(Integer id);
    void Update_team(Team team);
}
