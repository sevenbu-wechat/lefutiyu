package com.lefutiyu.sevenbu.mp.resource;

import com.google.gson.Gson;
import com.lefutiyu.sevenbu.mp.common.Response;
import com.lefutiyu.sevenbu.mp.dto.SignUpUserDTO;
import com.lefutiyu.sevenbu.mp.dto.TrainAddressScheduleDTO;
import com.lefutiyu.sevenbu.mp.service.LoveSportsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by guoqing on 2019/3/19.
 * 对外提供rest接口---统一为resource层
 */
@RestController
@RequestMapping("/customer")
public class LoveSportsResource {

    @Autowired
    private LoveSportsService loveSportsService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 报名
     * @param signUpUserDTO
     * @return
     */
    @PostMapping("/signUp")
    public String signUp(@RequestBody SignUpUserDTO signUpUserDTO){
        logger.error("test.....");
        Response<Object> response = new Response<>();
        try {
            loveSportsService.signUpUserInfo(signUpUserDTO);
            response.setResultCode("00");
        }catch (DuplicateKeyException e){
            response.setResultCode("01");
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            response.setResultCode("99");
        }
        return new Gson().toJson(response);
    }

    @PostMapping("/getShcedule")
    public String getShcedule(@RequestBody TrainAddressScheduleDTO trainAddressScheduleDTO){
        logger.error("test.....");
        Response<List<TrainAddressScheduleDTO>> response = new Response<>();
        try {
            List<TrainAddressScheduleDTO> data = loveSportsService.getShcedule(trainAddressScheduleDTO);
            if(data == null || data.isEmpty()){
                response.setResultCode("01");
                return new Gson().toJson(response);
            }
            response.setResultCode("00");
            response.setData(data);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            response.setResultCode("99");
        }
        return new Gson().toJson(response);
    }

}
