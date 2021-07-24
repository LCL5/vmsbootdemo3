package com.example.vmsbootdemo3.mapper;

import com.example.vmsbootdemo3.bean.Scrap;

import java.util.List;

public interface ScrapMapper {
    //显示所有
    List<Scrap> getAllScrap();
    //删除
    int DeleteScrap(String Number);
    //根据Number查询
    Scrap FindScrap(String Number);
    //修改
    int updateScrap(Scrap scrap);
    //插入
    int AddScrap(Scrap scrap);
}
