package com.example.second.service;

import com.example.second.entity.Answer;

import java.util.List;


public interface AnswerService {

    public List<Answer> findAllAnswers();
    
    Answer FindById(Integer id);

    public void addAnswer(Answer answer);

    public void deleteAnswerById(Long uid);

    public void updateAnswer(Answer answer);

    List<Answer> findAnswerByName(String name);

    public Integer deleteAnswersByIds(Integer[] ids);
}
