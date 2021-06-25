package com.example.second.service.impl;

import com.example.second.dao.MessagesDao;
import com.example.second.entity.Messages;
import com.example.second.service.MessagesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessagesServiceBean implements MessagesService {
    @Resource
    MessagesDao messagesDao;
    @Override
    public List<Messages> FindById(Integer id){
        return messagesDao.FindById(id);
    };
    @Override
    public void Update_messages(Messages messages){
        messagesDao.Update_messages(messages);
    }
}
