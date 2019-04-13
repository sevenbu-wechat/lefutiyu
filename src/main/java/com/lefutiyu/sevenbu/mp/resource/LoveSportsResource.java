package com.lefutiyu.sevenbu.mp.resource;

import com.lefutiyu.sevenbu.mp.dto.SignUpUserDTO;
import com.lefutiyu.sevenbu.mp.service.LoveSportsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        try {
            loveSportsService.signUpUserInfo(signUpUserDTO);
        }catch (Exception e){
            return "false";
        }
        return "success";
    }

}
