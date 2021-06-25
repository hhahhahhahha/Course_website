package com.example.second.dao;

import com.example.second.entity.Res;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component(value = "ResDao")
public interface ResDao {
    List<Res> FindById(Integer id);
    void Update_data(Res data);
}
