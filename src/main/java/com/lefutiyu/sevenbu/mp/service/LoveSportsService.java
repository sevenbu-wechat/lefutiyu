package com.lefutiyu.sevenbu.mp.service;

import com.lefutiyu.sevenbu.mp.dao.SignUpUserDAO;
import com.lefutiyu.sevenbu.mp.dao.TrainAddressScheduleDAO;
import com.lefutiyu.sevenbu.mp.dto.SignUpUserDTO;
import com.lefutiyu.sevenbu.mp.dto.TrainAddressScheduleDTO;
import jodd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guoqing on 2019/3/20.
 */
@Service
public class LoveSportsService {
    @Autowired
    private SignUpUserDAO signUpUserDAO;

    @Autowired
    private TrainAddressScheduleDAO trainAddressScheduleDAO;

    public void signUpUserInfo(SignUpUserDTO signUpUserDTO){



        Integer baseScheduleId = trainAddressScheduleDAO.getScheduleByBaseCodeAndShceduleCode(signUpUserDTO.getTrainBaseCode(), signUpUserDTO.getTimeScheduleCode());

        if (baseScheduleId == null){
            throw new RuntimeException();
        }

        signUpUserDTO.setTrainBaseScheduleId(baseScheduleId);

        int id = signUpUserDAO.insert(signUpUserDTO);
    }

    public List<TrainAddressScheduleDTO> getShcedule(TrainAddressScheduleDTO dto){
        String trainBaseCode = dto.getTrainBaseCode();
        if(StringUtil.isEmpty(trainBaseCode)){
            return null;
        }

        return trainAddressScheduleDAO.getScheduleByBaseCode(trainBaseCode);
    }
}
