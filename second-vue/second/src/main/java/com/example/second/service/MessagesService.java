package com.example.second.service;

import com.example.second.entity.Messages;

import java.util.List;

public interface MessagesService {
    List<Messages> FindById(Integer id);
    void Update_messages(Messages messages);
}
