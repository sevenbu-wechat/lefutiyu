package com.lefutiyu.sevenbu.mp.dao;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by guoqing on 2019/3/20.
 */
public abstract class BaseDAO {

    public abstract SqlSession getSqlSessionTemplate();

    public Object selectOne(String sqlId, Object param){
        return this.getSqlSessionTemplate().selectOne(sqlId, param);
    }

    public int insert(String sqlId, Object param){
        return this.getSqlSessionTemplate().insert(sqlId, param);
    }

    public <T> List<T> selectList(String sqlId, Map<String, Object> param){
        return this.getSqlSessionTemplate().selectList(sqlId, param);
    }

}
