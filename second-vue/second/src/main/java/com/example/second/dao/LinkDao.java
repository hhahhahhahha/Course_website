package com.example.second.dao;

import com.example.second.entity.Link;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "LinkDao")
public interface LinkDao {
    Link FindById(Integer id);
    List<Link> findAllLinks();

    int deleteLinkById(Long uid);

    int insert(Link link);

    int addLink(Link link);

    Link selectByPrimaryKey(Long uid);

    int updateLink(Link link);

    int updateByPrimaryKey(Link link);

    List<Link> findLinkByName(String name);

    Integer deleteLinksByIds(@Param("ids") Integer[] ids);

    int getCountLinks();
}
