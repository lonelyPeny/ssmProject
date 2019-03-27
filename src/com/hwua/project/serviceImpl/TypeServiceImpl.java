package com.hwua.project.serviceImpl;

import com.hwua.project.dao.TypeDao;
import com.hwua.project.entity.Type;
import com.hwua.project.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeDao typeDao;

    @Override
    public List<Type> selectAllType() {
        List<Type> list=typeDao.selectAllType();
        return list;
    }

    @Override
    public List<Type> selectAllBigType() {
        List<Type> list=typeDao.selectAllBigType();
        return list;
    }

    @Override
    public List<Type> selectAllSmailTypeByBigType(int type_id) {
        List<Type> list=typeDao.selectAllSmailTypeByBigType();
        return list;
    }
}
