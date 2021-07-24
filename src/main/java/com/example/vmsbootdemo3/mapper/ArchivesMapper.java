package com.example.vmsbootdemo3.mapper;

import com.example.vmsbootdemo3.bean.Archives;

import java.util.List;

public interface ArchivesMapper {
    //显示所有车辆档案
    List<Archives> getAllArchives();
    //删除车辆档案
    int DeleteArchives(String Number);
    //根据Number查询
    Archives FindArchives(String Number);
    //修改车辆档案
    int updateArchives(Archives archives);
    //插入车辆档案
    int AddArchives(Archives archives);
    //查询
    Archives getArchivesByNumber(String Number);
}
