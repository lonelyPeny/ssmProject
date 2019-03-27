package com.hwua.project.dao;

import com.hwua.project.entity.Goods;

import java.util.List;

public interface GoodsDao {
    public List<Goods> selectAllGoods();
}
