package com.example.second.dao;

import com.example.second.entity.Elite;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "EliteDao")
public interface EliteDao {
    void save(Elite elite);
    void add(Elite student);
    void delete(Integer id);
    Elite findById(Integer id);
    List<Elite> findAllElites() ;
}
