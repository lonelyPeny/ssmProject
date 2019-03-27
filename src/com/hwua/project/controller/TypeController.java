package com.hwua.project.controller;

import com.alibaba.fastjson.JSON;
import com.hwua.project.entity.Type;
import com.hwua.project.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    TypeService typeService;
//    查询所有商品类型
    @RequestMapping(value ="/selectAllType" ,produces ="text/html;charset=UTF-8" )
    @ResponseBody
    public String selectAllType(){

        return "";
    }

    @RequestMapping(value ="/selectAllBigType" ,produces ="text/html;charset=UTF-8" )
    @ResponseBody
    public String selectAllBigType(){
        List<Type> list=typeService.selectAllBigType();
        String str=JSON.toJSONString(list);
        return str;
    }
    @RequestMapping(value ="/selecrAllSmailTypeByBigType" ,produces ="text/html;charset=UTF-8" )
    @ResponseBody
    public String selecrAllSmailTypeByBigType(){
        List<List<Type>> lists=new ArrayList<List<Type>>();

        List<Type> bigType=typeService.selectAllBigType();
        for (int i=0;i<bigType.size();i++){
            List<Type> smail=typeService.selectAllSmailTypeByBigType(bigType.get(i).getType_big());
            lists.add(smail);
        }
        String str=JSON.toJSONString(bigType);
        return str;
    }
}
