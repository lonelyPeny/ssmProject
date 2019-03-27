package com.hwua.project.service;

import com.hwua.project.entity.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> selectAllGoods();
    public List<Goods> selectAllGoodsForPage(int pageNumber,int pageSize);
}
