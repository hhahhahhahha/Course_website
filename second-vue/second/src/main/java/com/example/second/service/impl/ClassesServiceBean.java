package com.example.second.service.impl;

import com.example.second.dao.ClassesDao;
import com.example.second.entity.Classes;
import com.example.second.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class ClassesServiceBean implements ClassesService {

    @Autowired
    private ClassesDao classesDao;


    public List<Classes> findAllClassess() {
        return this.classesDao.findAllClassess();
    }


    @Transactional
    public void addClasses(Classes classes) {
        this.classesDao.addClasses(classes);
//        this.classesCopyDao.addClasses(classes);
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
    }

    public void deleteClassesById(Long uid) {
        this.classesDao.deleteClassesById(uid);
    }

    public void updateClasses(Classes classes) {
        this.classesDao.updateClasses(classes);
    }

    public List<Classes> findClassesByName(String name) {
        return this.classesDao.findClassesByName(name);
    }

    public Integer deleteClassessByIds(Integer[] ids) {
        return this.classesDao.deleteClassessByIds(ids);
    }

}
