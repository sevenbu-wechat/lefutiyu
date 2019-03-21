package com.lefutiyu.sevenbu.mp.dao;

import org.apache.ibatis.session.SqlSession;

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

}
