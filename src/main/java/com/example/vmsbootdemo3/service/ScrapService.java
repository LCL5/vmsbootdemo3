package com.example.vmsbootdemo3.service;

import com.example.vmsbootdemo3.bean.Scrap;

import java.util.List;

public interface ScrapService {
    //查询所有车辆档案
    List<Scrap> queryAllScrap();
    //删除车辆档案
    int DeleteScrap(String Number);
    //根据ID查询
    Scrap FindScrap(String Number);
    //修改
    int modifyScrap(Scrap scrap);
    //增加
    int AddScrap(Scrap scrap);
}
