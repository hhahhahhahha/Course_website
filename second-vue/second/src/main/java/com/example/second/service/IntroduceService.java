package com.example.second.service;

import com.example.second.entity.Introduce;

import java.util.List;


public interface IntroduceService {

    public List<Introduce> findAllIntroduces();
    
    Introduce FindById(Integer id);

    public void addIntroduce(Introduce introduce);

    public void deleteIntroduceById(Long uid);

    public void updateIntroduce(Introduce introduce);

    List<Introduce> findIntroduceByName(String name);

    public Integer deleteIntroducesByIds(Integer[] ids);
}
