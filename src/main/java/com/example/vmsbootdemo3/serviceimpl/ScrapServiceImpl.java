package com.example.vmsbootdemo3.serviceimpl;

import com.example.vmsbootdemo3.bean.Scrap;
import com.example.vmsbootdemo3.mapper.ScrapMapper;
import com.example.vmsbootdemo3.service.ScrapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScrapServiceImpl implements ScrapService {
    @Autowired(required = false)//Autowired自动装配失败时，required = false
    private ScrapMapper scrapMapper;

    //查询车辆档案
    @Override
    public List<Scrap> queryAllScrap() {
        return scrapMapper.getAllScrap();
    }
    //删除
    @Override
    public int DeleteScrap(String Number) {
        int dFlag = scrapMapper.DeleteScrap(Number);
        return dFlag;
    }
    //修改
    @Override
    public int modifyScrap(Scrap scrap) {
        int mFlag = scrapMapper.updateScrap(scrap);
        return mFlag;
    }
    //增加
    public int AddScrap(Scrap scrap) {
        int aFlag = scrapMapper.AddScrap(scrap);
        return aFlag;
    }
    //查询
    @Override
    public Scrap FindScrap(String Number) {
        return scrapMapper.FindScrap(Number);
    }
}
