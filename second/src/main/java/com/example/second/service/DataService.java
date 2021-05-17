package com.example.second.service;

import com.example.second.entity.Data;

import java.util.List;

public interface DataService {
    List<Data> FindById(Integer id);
    void Update_data(Data data);
}
