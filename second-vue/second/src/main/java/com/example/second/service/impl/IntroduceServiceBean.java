package com.example.second.service.impl;

import com.example.second.dao.IntroduceDao;
import com.example.second.entity.Introduce;
import com.example.second.service.IntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class IntroduceServiceBean implements IntroduceService {

    @Autowired
    private IntroduceDao introduceDao;


    public List<Introduce> findAllIntroduces() {
        return this.introduceDao.findAllIntroduces();
    }


    @Transactional
    public void addIntroduce(Introduce introduce) {
        this.introduceDao.addIntroduce(introduce);
//        this.introduceCopyDao.addIntroduce(introduce);
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
    }
    public Introduce FindById(Integer id){
        return introduceDao.FindById(id);
    };
    public void deleteIntroduceById(Long uid) {
        this.introduceDao.deleteIntroduceById(uid);
    }

    public void updateIntroduce(Introduce introduce) {
        this.introduceDao.updateIntroduce(introduce);
    }

    public List<Introduce> findIntroduceByName(String name) {
        return this.introduceDao.findIntroduceByName(name);
    }

    public Integer deleteIntroducesByIds(Integer[] ids) {
        return this.introduceDao.deleteIntroducesByIds(ids);
    }

}
