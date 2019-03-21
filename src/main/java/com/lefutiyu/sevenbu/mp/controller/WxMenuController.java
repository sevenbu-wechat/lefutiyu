package com.lefutiyu.sevenbu.mp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpMenuService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.menu.WxMpGetSelfMenuInfoResult;
import me.chanjar.weixin.mp.bean.menu.WxMpMenu;
import org.springframework.web.servlet.ModelAndView;

import static me.chanjar.weixin.common.api.WxConsts.MenuButtonType;

/**
 * <pre>
 *  注意：此contorller 实现WxMpMenuService接口，仅是为了演示如何调用所有菜单相关操作接口，
 *      实际项目中无需这样，根据自己需要添加对应接口即可
 * </pre>
 *
 * @author Binary Wang(https://github.com/binarywang)
 */
@RestController
@RequestMapping("/createmenu ")
public class WxMenuController implements WxMpMenuService {
  @Autowired
  private WxMpService wxService;

  /**{
   return this.wxService.getMenuService().menuCreate(menu);
   }

   @GetMapping("/create")
   public
   * <pre>
   * 自定义菜单创建接口
   * 详情请见：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141013&token=&lang=zh_CN
   * 如果要创建个性化菜单，请设置matchrule属性
   * 详情请见：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1455782296&token=&lang=zh_CN
   * </pre>
   *
   * @param menu 菜单
   * @return 如果是个性化菜单，则返回menuid，否则返回null
   */
  @Override
  @PostMapping("/create")
  public String menuCreate(@RequestBody WxMenu menu) throws WxErrorException {
    return this.wxService.getMenuService().menuCreate(menu);
  }

  @GetMapping("/create")
  public String menuCreateSample() throws WxErrorException {
    WxMenu menu = new WxMenu();

    WxMenuButton button1 = new WxMenuButton();
    button1.setName("课程选项");
    menu.getButtons().add(button1);

    WxMenuButton button11 = new WxMenuButton();
    button11.setType(MenuButtonType.VIEW);
    button11.setName("免费试课");
    button11.setUrl("https://mp.weixin.qq.com/s/PqBQLJQFC44FS8jmzCtSug");

    WxMenuButton button12 = new WxMenuButton();
    button12.setType(MenuButtonType.VIEW);
    button12.setName("2019春季班");
    button12.setUrl("https://mp.weixin.qq.com/s/se1xy5AQ2pd6HB2OWsIiJQ");

    WxMenuButton button13 = new WxMenuButton();
    button13.setType(MenuButtonType.VIEW);
    button13.setName("中考体育训练营");
    button13.setUrl("https://mp.weixin.qq.com/s/4uwvIwqTeIB_3FXadkJ0Hw");

    WxMenuButton button14 = new WxMenuButton();
    button14.setType(MenuButtonType.VIEW);
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
    button21.setType(MenuButtonType.VIEW);
    button21.setName("请假补课");
    button21.setUrl("https://mp.weixin.qq.com/s/cMnNvoxQSArcnhbW9QuUTg");

    WxMenuButton button22 = new WxMenuButton();
    button22.setType(MenuButtonType.VIEW);
    button22.setName("学员风采");
    button22.setUrl("https://mp.weixin.qq.com/s/E0nf2jed07xSJacacB-eaA");

    WxMenuButton button23 = new WxMenuButton();
    button23.setType(MenuButtonType.VIEW);
    button23.setName("查询服务");
    button23.setUrl("https://www.baidu.com");

    button2.getSubButtons().add(button21);
    button2.getSubButtons().add(button22);
    button2.getSubButtons().add(button23);

    WxMenuButton button3 = new WxMenuButton();
    button3.setName("加入勒夫");
    menu.getButtons().add(button3);

    WxMenuButton button31 = new WxMenuButton();
    button31.setType(MenuButtonType.VIEW);
    button31.setName("勒夫简介");
    button31.setUrl("https://mp.weixin.qq.com/s/n_St1SDjVfW2LXikS4JU7g");

    WxMenuButton button32 = new WxMenuButton();
    button32.setType(MenuButtonType.VIEW);
    button32.setName("教练团队");
    button32.setUrl("https://mp.weixin.qq.com/s/pjfGLrJVoVZ7ez3ALdbkYQ");

    WxMenuButton button33 = new WxMenuButton();
    button33.setType(MenuButtonType.VIEW);
    button33.setName("场馆介绍");
    button33.setUrl("https://mp.weixin.qq.com/s/0FPiwlTq1KRIP9QBKILTqA");

    WxMenuButton button34 = new WxMenuButton();
    button34.setType(MenuButtonType.VIEW);
    button34.setName("学员报名");
    button34.setUrl("http://www.bupingfan.net.cn/lefutiyu");

    WxMenuButton button35 = new WxMenuButton();
    button35.setType(MenuButtonType.CLICK);
    button35.setName("联系我们");
    button35.setKey("15962987671 刘教练  13861903320 汤教练");

    button3.getSubButtons().add(button31);
    button3.getSubButtons().add(button32);
    button3.getSubButtons().add(button33);
    button3.getSubButtons().add(button34);
    button3.getSubButtons().add(button35);

    return this.wxService.getMenuService().menuCreate(menu);
  }

  /**
   * <pre>
   * 自定义菜单创建接口
   * 详情请见： https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141013&token=&lang=zh_CN
   * 如果要创建个性化菜单，请设置matchrule属性
   * 详情请见：https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1455782296&token=&lang=zh_CN
   * </pre>
   *
   * @param json 菜单json字符串
   * @return 如果是个性化菜单，则返回menuid，否则返回null
   */
  @Override
  @PostMapping("/createByJson")
  public String menuCreate(@RequestBody String json) throws WxErrorException {
    return this.wxService.getMenuService().menuCreate(json);
  }

  /**
   * <pre>
   * 自定义菜单删除接口
   * 详情请见: https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141015&token=&lang=zh_CN
   * </pre>
   */
  @Override
  @GetMapping("/delete")
  public void menuDelete() throws WxErrorException {
    this.wxService.getMenuService().menuDelete();
  }

  /**
   * <pre>
   * 删除个性化菜单接口
   * 详情请见: https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1455782296&token=&lang=zh_CN
   * </pre>
   *
   * @param menuId 个性化菜单的menuid
   */
  @Override
  @GetMapping("/delete/{menuId}")
  public void menuDelete(@PathVariable String menuId) throws WxErrorException {
    this.wxService.getMenuService().menuDelete(menuId);
  }

  /**
   * <pre>
   * 自定义菜单查询接口
   * 详情请见： https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421141014&token=&lang=zh_CN
   * </pre>
   */
  @Override
  @GetMapping("/get")
  public WxMpMenu menuGet() throws WxErrorException {
    return this.wxService.getMenuService().menuGet();
  }

  @GetMapping("/test")
  public ModelAndView test(){
    ModelAndView mv = new ModelAndView("login");
    return mv;
  }

  /**
   * <pre>
   * 测试个性化菜单匹配结果
   * 详情请见: http://mp.weixin.qq.com/wiki/0/c48ccd12b69ae023159b4bfaa7c39c20.html
   * </pre>
   *
   * @param userid 可以是粉丝的OpenID，也可以是粉丝的微信号。
   */
  @Override
  @GetMapping("/menuTryMatch/{userid}")
  public WxMenu menuTryMatch(@PathVariable String userid) throws WxErrorException {
    return this.wxService.getMenuService().menuTryMatch(userid);
  }

  /**
   * <pre>
   * 获取自定义菜单配置接口
   * 本接口将会提供公众号当前使用的自定义菜单的配置，如果公众号是通过API调用设置的菜单，则返回菜单的开发配置，而如果公众号是在公众平台官网通过网站功能发布菜单，则本接口返回运营者设置的菜单配置。
   * 请注意：
   * 1、第三方平台开发者可以通过本接口，在旗下公众号将业务授权给你后，立即通过本接口检测公众号的自定义菜单配置，并通过接口再次给公众号设置好自动回复规则，以提升公众号运营者的业务体验。
   * 2、本接口与自定义菜单查询接口的不同之处在于，本接口无论公众号的接口是如何设置的，都能查询到接口，而自定义菜单查询接口则仅能查询到使用API设置的菜单配置。
   * 3、认证/未认证的服务号/订阅号，以及接口测试号，均拥有该接口权限。
   * 4、从第三方平台的公众号登录授权机制上来说，该接口从属于消息与菜单权限集。
   * 5、本接口中返回的图片/语音/视频为临时素材（临时素材每次获取都不同，3天内有效，通过素材管理-获取临时素材接口来获取这些素材），本接口返回的图文消息为永久素材素材（通过素材管理-获取永久素材接口来获取这些素材）。
   *  接口调用请求说明:
   * http请求方式: GET（请使用https协议）
   * https://api.weixin.qq.com/cgi-bin/get_current_selfmenu_info?access_token=ACCESS_TOKEN
   * </pre>
   */
  @Override
  @GetMapping("/getSelfMenuInfo")
  public WxMpGetSelfMenuInfoResult getSelfMenuInfo() throws WxErrorException {
    return this.wxService.getMenuService().getSelfMenuInfo();
  }
}
