package com.example.second.service;

import com.example.second.entity.Elite;

import java.util.List;


public interface EliteService {
    void save(Elite elite);
    void add(Elite elite);
    void delete(Integer id);
    Elite findById(Integer id);
    List<Elite> findAllElites();
}
