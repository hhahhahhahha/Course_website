package com.example.second.dao;

import com.example.second.entity.Introduce;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "IntroduceDao")
public interface IntroduceDao {
    Introduce FindById(Integer id);
    List<Introduce> findAllIntroduces();

    int deleteIntroduceById(Long uid);

    int insert(Introduce introduce);

    int addIntroduce(Introduce introduce);

    Introduce selectByPrimaryKey(Long uid);

    int updateIntroduce(Introduce introduce);

    int updateByPrimaryKey(Introduce introduce);

    List<Introduce> findIntroduceByName(String name);

    Integer deleteIntroducesByIds(@Param("ids") Integer[] ids);

    int getCountIntroduces();
}
