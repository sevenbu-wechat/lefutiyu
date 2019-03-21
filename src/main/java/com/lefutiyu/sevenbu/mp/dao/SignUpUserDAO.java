package com.lefutiyu.sevenbu.mp.dao;

import com.lefutiyu.sevenbu.mp.dto.SignUpUserDTO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by guoqing on 2019/3/20.
 */
@Repository
public class SignUpUserDAO extends BaseDAO{


    private static String sqlId = "SIGN_UP_USER.";
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public SqlSession getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public int insert(SignUpUserDTO signUpUserDTO){
        return super.insert(sqlId + "insert", signUpUserDTO);
    }
}
