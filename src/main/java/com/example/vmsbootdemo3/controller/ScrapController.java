package com.example.vmsbootdemo3.controller;

import com.example.vmsbootdemo3.bean.Scrap;
import com.example.vmsbootdemo3.service.ScrapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ScrapController {
    @Autowired(required = false)
    ScrapService scrapService;

    /*查询所有报废车辆*/
    @RequestMapping("/Scrap")
    public String ViewScarp(ModelMap Map) {
        List<Scrap> scrapList = scrapService.queryAllScrap();
        Map.addAttribute("scrapList", scrapList);
        return "scrap";
    }

    /*删除*/
    @RequestMapping(value = "/deleteScrap+{Number}")
    public String DeleteScrap(@PathVariable("Number") String Number, ModelMap Map) {
        int flag0 = scrapService.DeleteScrap(Number);
        List<Scrap> scrapList = scrapService.queryAllScrap();
        Map.addAttribute("scrapList", scrapList);
        if (flag0 == 1) {
            return "scrap";
        } else {
            return "index";
        }
    }
    /*增加*/
    @RequestMapping("/addScrap")
    @ResponseBody
    public Map AddScrap(Scrap scrap){
        int flag = scrapService.AddScrap(scrap);
        Map<String,Object> map = new HashMap<String,Object>();
        if(flag == 1){
            map.put("msg","新增报废车辆成功");
            return map;
        }else {
            map.put("msg","新增报废车辆失败");
            return map;
        }
    }
    /*修改*/
    @RequestMapping("/modifyScrap")
    @ResponseBody
    public Map modifyScrap(Scrap scrap){
        int flag = scrapService.modifyScrap(scrap);
        Map<String,Object> map = new HashMap<>();
        if(flag == 1){
            map.put("msg","修改报废车辆信息成功");
            return map;
        }else {
            map.put("msg","修改报废车辆信息失败");
            return map;
        }
    }
    /*根据id查询*/
    @RequestMapping("/scrap+{Number}")
    public String FindScrap(@PathVariable("Number") String Number,ModelMap modelMap){
        Scrap scrapList = scrapService.FindScrap(Number);
        modelMap.addAttribute("scrapList",scrapList);
        return "modifyScrap";
    }
}
