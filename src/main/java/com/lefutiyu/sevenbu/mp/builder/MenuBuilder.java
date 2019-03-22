package com.lefutiyu.sevenbu.mp.builder;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import org.springframework.stereotype.Service;

/**
 * Created by guoqing on 2019/3/22.
 */
@Service
public class MenuBuilder {

    public static WxMenu buildMenu(){
        WxMenu menu = new WxMenu();

        WxMenuButton button1 = new WxMenuButton();
        button1.setName("课程选项");
        menu.getButtons().add(button1);

        WxMenuButton button11 = new WxMenuButton();
        button11.setType(WxConsts.MenuButtonType.VIEW);
        button11.setName("免费试课");
        button11.setUrl("https://mp.weixin.qq.com/s/PqBQLJQFC44FS8jmzCtSug");

        WxMenuButton button12 = new WxMenuButton();
        button12.setType(WxConsts.MenuButtonType.VIEW);
        button12.setName("2019春季班");
        button12.setUrl("https://mp.weixin.qq.com/s/se1xy5AQ2pd6HB2OWsIiJQ");

        WxMenuButton button13 = new WxMenuButton();
        button13.setType(WxConsts.MenuButtonType.VIEW);
        button13.setName("中考体育训练营");
        button13.setUrl("https://mp.weixin.qq.com/s/4uwvIwqTeIB_3FXadkJ0Hw");

        WxMenuButton button14 = new WxMenuButton();
        button14.setType(WxConsts.MenuButtonType.VIEW);
        button14.setName("课程介绍");
        button14.setUrl("https://mp.weixin.qq.com/s/rR_9UVsoKoQUGv4p5LpJCg");

        button1.getSubButtons().add(button11);
        button1.getSubButtons().add(button12);
        button1.getSubButtons().add(button13);
        button1.getSubButtons().add(button14);

        WxMenuButton button2 = new WxMenuButton();
        button2.setName("学员服务");
        menu.getButtons().add(button2);

        WxMenuButton button21 = new WxMenuButton();
        button21.setType(WxConsts.MenuButtonType.VIEW);
        button21.setName("请假补课");
        button21.setUrl("https://mp.weixin.qq.com/s/cMnNvoxQSArcnhbW9QuUTg");

        WxMenuButton button22 = new WxMenuButton();
        button22.setType(WxConsts.MenuButtonType.VIEW);
        button22.setName("学员风采");
        button22.setUrl("https://mp.weixin.qq.com/s/E0nf2jed07xSJacacB-eaA");

        WxMenuButton button23 = new WxMenuButton();
        button23.setType(WxConsts.MenuButtonType.VIEW);
        button23.setName("查询服务");
        button23.setUrl("https://www.baidu.com");

        button2.getSubButtons().add(button21);
        button2.getSubButtons().add(button22);
        button2.getSubButtons().add(button23);

        WxMenuButton button3 = new WxMenuButton();
        button3.setName("加入勒夫");
        menu.getButtons().add(button3);

        WxMenuButton button31 = new WxMenuButton();
        button31.setType(WxConsts.MenuButtonType.VIEW);
        button31.setName("勒夫简介");
        button31.setUrl("https://mp.weixin.qq.com/s/n_St1SDjVfW2LXikS4JU7g");

        WxMenuButton button32 = new WxMenuButton();
        button32.setType(WxConsts.MenuButtonType.VIEW);
        button32.setName("教练团队");
        button32.setUrl("https://mp.weixin.qq.com/s/pjfGLrJVoVZ7ez3ALdbkYQ");

        WxMenuButton button33 = new WxMenuButton();
        button33.setType(WxConsts.MenuButtonType.VIEW);
        button33.setName("场馆介绍");
        button33.setUrl("https://mp.weixin.qq.com/s/0FPiwlTq1KRIP9QBKILTqA");

        WxMenuButton button34 = new WxMenuButton();
        button34.setType(WxConsts.MenuButtonType.VIEW);
        button34.setName("学员报名");
        button34.setUrl("http://www.bupingfan.net.cn/lefutiyu");

        WxMenuButton button35 = new WxMenuButton();
        button35.setType(WxConsts.MenuButtonType.CLICK);
        button35.setName("联系我们");
        button35.setKey("15962987671 刘教练  13861903320 汤教练");

        button3.getSubButtons().add(button31);
        button3.getSubButtons().add(button32);
        button3.getSubButtons().add(button33);
        button3.getSubButtons().add(button34);
        button3.getSubButtons().add(button35);

        return menu;
    }
}
