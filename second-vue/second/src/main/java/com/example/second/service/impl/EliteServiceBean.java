package com.example.second.service.impl;

import com.example.second.dao.EliteDao;
import com.example.second.entity.Elite;
import com.example.second.service.EliteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EliteServiceBean implements EliteService {
    @Resource
    EliteDao eliteDao;
    @Override
    public void save(Elite elite){
        eliteDao.save(elite);
    };
    @Override
    public void add(Elite elite){
        eliteDao.add(elite);
    };
    @Override
    public void delete(Integer id){
        eliteDao.delete(id);
    };
    @Override
    public Elite findById(Integer id){
        return eliteDao.findById(id);
    };
    @Override
    public List<Elite> findAllElites(){
        return eliteDao.findAllElites();
    };
}
