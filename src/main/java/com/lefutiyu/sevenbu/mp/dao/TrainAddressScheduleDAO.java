package com.lefutiyu.sevenbu.mp.dao;

import com.lefutiyu.sevenbu.mp.dto.SignUpUserDTO;
import com.lefutiyu.sevenbu.mp.dto.TrainAddressScheduleDTO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guoqing on 2019/3/20.
 */
@Repository
public class TrainAddressScheduleDAO extends BaseDAO{


    private static String sqlId = "TRAIN_ADDRESS_SCHEDULE.";
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public SqlSession getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public List<TrainAddressScheduleDTO> getScheduleByBaseCode(String trainBaseCode){
        Map<String, Object> param = new HashMap<>();
        param.put("trainBaseCode", trainBaseCode);
        return super.selectList(sqlId + "getScheduleByBaseCode", param);
    }

    public Integer getScheduleByBaseCodeAndShceduleCode(String trainBaseCode, Integer scheduleCode){

        Map<String, Object> param = new HashMap<>();
        param.put("trainBaseCode", trainBaseCode);
        param.put("timeScheduleCode", scheduleCode);

        return (Integer) super.selectOne(sqlId + "getScheduleByBaseCodeAndShceduleCode", param);
    }
}
