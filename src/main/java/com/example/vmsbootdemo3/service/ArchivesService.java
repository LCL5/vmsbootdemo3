package com.example.vmsbootdemo3.service;

import com.example.vmsbootdemo3.bean.Archives;

import java.util.List;

public interface ArchivesService {
    //查询所有车辆档案
    List<Archives> queryAllArchives();
    //删除车辆档案
    int DeleteArchives(String Number);
    //根据ID查询
    Archives FindArchives(String Number);
    //修改
    int modifyArchives(Archives archives);
    //增加
    int AddArchives(Archives archives);
}
