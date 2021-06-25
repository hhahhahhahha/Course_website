package com.example.second.service.impl;

import com.example.second.dao.DataDao;
import com.example.second.entity.Data;
import com.example.second.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataServiceBean implements DataService {
    @Resource
    DataDao dataDao;
    @Override
    public List<Data> FindById(Integer id){
        return dataDao.FindById(id);
    };
    @Override
    public void Update_data(Data data){
        dataDao.Update_data(data);
    }
}
