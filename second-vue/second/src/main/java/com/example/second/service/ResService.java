package com.example.second.service;

import com.example.second.entity.Res;

import java.util.List;

public interface ResService {
    List<Res> FindById(Integer id);
    void Update_data(Res data);
}