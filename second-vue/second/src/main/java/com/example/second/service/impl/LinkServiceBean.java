package com.example.second.service.impl;

import com.example.second.dao.LinkDao;
import com.example.second.entity.Link;
import com.example.second.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class LinkServiceBean implements LinkService {

    @Autowired
    private LinkDao linkDao;


    public List<Link> findAllLinks() {
        return this.linkDao.findAllLinks();
    }


    @Transactional
    public void addLink(Link link) {
        this.linkDao.addLink(link);
//        this.linkCopyDao.addLink(link);
//        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
//        int x = 5 / 0;
    }
    public Link FindById(Integer id){
        return linkDao.FindById(id);
    };
    public void deleteLinkById(Long uid) {
        this.linkDao.deleteLinkById(uid);
    }

    public void updateLink(Link link) {
        this.linkDao.updateLink(link);
    }

    public List<Link> findLinkByName(String name) {
        return this.linkDao.findLinkByName(name);
    }

    public Integer deleteLinksByIds(Integer[] ids) {
        return this.linkDao.deleteLinksByIds(ids);
    }

}
