package com.hwua.project.dao;

import com.hwua.project.entity.Type;

import java.util.List;

public interface TypeDao {
//    查询所有商品类型
    public List<Type> selectAllType();
//    查询所有商品大类型
    public List<Type> selectAllBigType();
//    根据大类型ID查询所有对应的小商品
    public List<Type> selectAllSmailTypeByBigType();
}
