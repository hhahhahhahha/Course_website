package com.example.second.service.impl;

import com.example.second.dao.AnswerDao;
import com.example.second.entity.Answer;
import com.example.second.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class AnswerServiceBean implements AnswerService {

    @Autowired
    private AnswerDao answerDao;


    public List<Answer> findAllAnswers() {
        return this.answerDao.findAllAnswers();
    }


    @Transactional
    public void addAnswer(Answer answer) {
        this.answerDao.addAnswer(answer);
//        this.answerCopyDao.addAnswer(answer);
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
    }
    public Answer FindById(Integer id){
        return answerDao.FindById(id);
    };
    public void deleteAnswerById(Long uid) {
        this.answerDao.deleteAnswerById(uid);
    }

    public void updateAnswer(Answer answer) {
        this.answerDao.updateAnswer(answer);
    }

    public List<Answer> findAnswerByName(String name) {
        return this.answerDao.findAnswerByName(name);
    }

    public Integer deleteAnswersByIds(Integer[] ids) {
        return this.answerDao.deleteAnswersByIds(ids);
    }

}
