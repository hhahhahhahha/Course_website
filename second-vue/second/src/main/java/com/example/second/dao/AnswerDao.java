package com.example.second.dao;

import com.example.second.entity.Answer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "AnswerDao")
public interface AnswerDao {
    Answer FindById(Integer id);
    List<Answer> findAllAnswers();

    int deleteAnswerById(Long uid);

    int insert(Answer answer);

    int addAnswer(Answer answer);

    Answer selectByPrimaryKey(Long uid);

    int updateAnswer(Answer answer);

    int updateByPrimaryKey(Answer answer);

    List<Answer> findAnswerByName(String name);

    Integer deleteAnswersByIds(@Param("ids") Integer[] ids);

    int getCountAnswers();
}
