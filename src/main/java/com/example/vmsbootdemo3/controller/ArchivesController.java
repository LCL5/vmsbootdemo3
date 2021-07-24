package com.example.vmsbootdemo3.controller;

import com.example.vmsbootdemo3.bean.Archives;
import com.example.vmsbootdemo3.service.ArchivesService;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ArchivesController {
    @Autowired(required = false)
    ArchivesService archivesService;

    /*查询所有车辆档案*/
    @RequestMapping("/archives")
    public String  ViewArchives(ModelMap Map) {
        List<Archives> archives = archivesService.queryAllArchives();
        Map.addAttribute("archivesList", archives);
        return "archives";
    }
    /*删除*/
    @RequestMapping(value = "/deleteArchives+{Number}")
    public String DeleteArchives(@PathVariable("Number") String Number, ModelMap Map){
        int flag0 = archivesService.DeleteArchives(Number);
        List<Archives> archivesList = archivesService.queryAllArchives();
        Map.addAttribute("userList",archivesList);
        if(flag0 == 1){
            return "redirect:archives";
        }else {
            return "login";
        }
    }
    /*增加*/
    @RequestMapping(value="/archives.to",method=RequestMethod.GET)
   public String addArchives(){
        return "addArchives";
    }
    @RequestMapping("/addArchives")
    @ResponseBody
    public Map AddArchives(Archives archives){
        int flag = archivesService.AddArchives(archives);
        Map<String,Object> map = new HashMap<>();
        if(flag == 1){
            map.put("msg","新增档案成功");
            return map;
        }else {
            map.put("msg","新增档案失败");
            return map;
        }
    }
    /*修改*/
    @RequestMapping("/modifyArchives")
    @ResponseBody
    public Map modifyArchives(Archives archives){
        int flag = archivesService.modifyArchives(archives);
        Map<String,Object> map = new HashMap<>();
        if(flag == 1){
            map.put("msg","修改档案信息成功");
            return map;
        }else {
            map.put("msg","修改档案信息失败");
            return map;
        }
    }
    /*根据id查询*/
    @RequestMapping("/archives+{Number}")
    public String FindArchives(@PathVariable("Number") String Number,ModelMap modelMap){
        Archives archivesList = archivesService.FindArchives(Number);
        modelMap.addAttribute("archivesList",archivesList);
        return "modifyArchives";
    }
    @RequestMapping(value="/archives.do",method=RequestMethod.GET)
    public String ToScrap(){
        return "scrap";
    }
    //模糊查询
    @RequestMapping("/archivess+{Number}")
    public String SearchArchives(@PathVariable("Number") String Number,ModelMap modelMap){
        Archives archivesList = archivesService.FindArchives(Number);
        modelMap.addAttribute("archivesList",archivesList);
        return "searchArchives";
    }
}

