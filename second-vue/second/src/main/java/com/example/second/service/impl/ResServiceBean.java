package com.example.second.service.impl;

import com.example.second.dao.ResDao;
import com.example.second.entity.Res;
import com.example.second.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResServiceBean implements ResService {
    @Resource
    ResDao dataDao;
    @Override
    public List<Res> FindById(Integer id){
        return dataDao.FindById(id);
    };
    @Override
    public void Update_data(Res data){
        dataDao.Update_data(data);
    }
}
