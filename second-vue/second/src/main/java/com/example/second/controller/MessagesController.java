package com.example.second.controller;

import com.example.second.entity.Messages;
import com.example.second.service.MessagesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessagesController {
    @Resource
    MessagesService messagesService;
    @GetMapping("/{id}")
    public List<Messages> FindById(@PathVariable Integer id){
        return  messagesService.FindById(id);
    }
    @PutMapping("/update")
    public void Update_messages(@RequestBody Messages messages){
        messagesService.Update_messages(messages);
    }
}
