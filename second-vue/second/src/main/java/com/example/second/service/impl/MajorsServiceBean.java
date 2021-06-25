package com.example.second.service.impl;

import com.example.second.dao.MajorsDao;
import com.example.second.entity.Majors;
import com.example.second.service.MajorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class MajorsServiceBean implements MajorsService {

    @Autowired
    private MajorsDao majorsDao;


    public List<Majors> findAllMajorss() {
        return this.majorsDao.findAllMajorss();
    }


    @Transactional
    public void addMajors(Majors majors) {
        this.majorsDao.addMajors(majors);
//        this.majorsCopyDao.addMajors(majors);
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
    }

    public void deleteMajorsById(Long uid) {
        this.majorsDao.deleteMajorsById(uid);
    }

    public void updateMajors(Majors majors) {
        this.majorsDao.updateMajors(majors);
    }

    public List<Majors> findMajorsByName(String name) {
        return this.majorsDao.findMajorsByName(name);
    }

    public Integer deleteMajorssByIds(Integer[] ids) {
        return this.majorsDao.deleteMajorssByIds(ids);
    }

}
