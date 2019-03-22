package com.lefutiyu.sevenbu.mp.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by guoqing on 2019/3/22.
 */
@Service
public class ApplicationContextUtil implements ApplicationContextAware {
    // Spring应用上下文环境
    private static ApplicationContext applicationContext;

    /**
     * 实现ApplicationContextAware接口的回调方法。设置上下文环境
     *
     * @param applicationContext
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    /**
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 获取对象
     *
     * @param name
     * @return Object
     */
    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }

    public static Object getBean(Class var1){
        return applicationContext.getBean(var1);
    }
}
