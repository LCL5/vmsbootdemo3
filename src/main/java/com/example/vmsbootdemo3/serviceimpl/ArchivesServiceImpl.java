package com.example.vmsbootdemo3.serviceimpl;

import com.example.vmsbootdemo3.bean.Archives;
import com.example.vmsbootdemo3.mapper.ArchivesMapper;
import com.example.vmsbootdemo3.service.ArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchivesServiceImpl implements ArchivesService {
    @Autowired(required = false)//Autowired自动装配失败时，required = false
    private ArchivesMapper archivesMapper;

    //查询车辆档案
    @Override
    public List<Archives> queryAllArchives() {
        return archivesMapper.getAllArchives();
    }
    //删除
    @Override
    public int DeleteArchives(String Number) {
        int dFlag = archivesMapper.DeleteArchives(Number);
        return dFlag;
    }
    //修改
    @Override
    public int modifyArchives(Archives archives) {
        int mFlag = archivesMapper.updateArchives(archives);
        return mFlag;
    }
    //增加
    public int AddArchives(Archives archives) {
        int aFlag = archivesMapper.AddArchives(archives);
        return aFlag;
    }
    //查询
    @Override
    public Archives FindArchives(String Number) {
        return archivesMapper.FindArchives(Number);
    }
}
