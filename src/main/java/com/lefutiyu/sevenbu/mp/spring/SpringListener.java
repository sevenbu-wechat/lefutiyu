package com.lefutiyu.sevenbu.mp.spring;

import com.lefutiyu.sevenbu.mp.builder.MenuBuilder;
import com.lefutiyu.sevenbu.mp.common.ApplicationContextUtil;
import com.lefutiyu.sevenbu.mp.controller.WxMenuController;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.mp.api.WxMpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class SpringListener implements ApplicationListener<ContextRefreshedEvent> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WxMpService wxService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {

            WxMenu wxMenu = MenuBuilder.buildMenu();

            if(wxService == null){
                logger.error("------------------nullll");
                wxService.getMenuService().menuCreate(wxMenu);
            }
            //String menuId = wxMenuController.menuCreateSample();
            logger.error("------------------finish");
        }catch (Exception e){
            logger.error("------------------exception", e);
        }
    }

}
 

