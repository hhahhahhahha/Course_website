package com.example.second.dao;

import com.example.second.entity.Messages;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "MessagesDao")
public interface MessagesDao {
    List<Messages> FindById(Integer id);
    void Update_messages(Messages messages);
}
