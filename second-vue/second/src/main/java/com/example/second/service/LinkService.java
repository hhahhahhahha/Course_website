package com.example.second.service;

import com.example.second.entity.Link;

import java.util.List;


public interface LinkService {

    public List<Link> findAllLinks();

    Link FindById(Integer id);

    public void addLink(Link link);

    public void deleteLinkById(Long uid);

    public void updateLink(Link link);

    List<Link> findLinkByName(String name);

    public Integer deleteLinksByIds(Integer[] ids);
}
