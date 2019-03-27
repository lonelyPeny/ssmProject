package com.hwua.project.service;

import com.hwua.project.entity.Type;

import java.util.List;

public interface TypeService {
    public List<Type> selectAllType();
    public List<Type> selectAllBigType();
    public List<Type> selectAllSmailTypeByBigType(int type_id);


}
