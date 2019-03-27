package com.hwua.project.controller;

import com.alibaba.fastjson.JSON;
import com.hwua.project.entity.Goods;
import com.hwua.project.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @RequestMapping(value ="/getGoods" ,produces ="text/html;charset=UTF-8" )
    @ResponseBody
    public String getGoods(){
        List<Goods> list=goodsService.selectAllGoodsForPage(1,12);
        String str=JSON.toJSONString(list);
        return str;
    }
}
