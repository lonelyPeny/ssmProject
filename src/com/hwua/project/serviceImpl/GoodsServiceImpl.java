package com.hwua.project.serviceImpl;


import com.hwua.project.dao.GoodsDao;
import com.hwua.project.entity.Goods;
import com.hwua.project.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;
    @Override
    public List<Goods> selectAllGoods() {
        List<Goods> list=goodsDao.selectAllGoods();
        return list;
    }

    @Override
    public List<Goods> selectAllGoodsForPage(int pageNumber, int pageSize) {

        List<Goods> list=goodsDao.selectAllGoods();
        return list;

    }
}
