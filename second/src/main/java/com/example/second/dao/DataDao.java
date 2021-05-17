package com.example.second.dao;

import com.example.second.entity.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component(value = "DataDao")
public interface DataDao {
    List<Data> FindById(Integer id);
    void Update_data(Data data);
}
