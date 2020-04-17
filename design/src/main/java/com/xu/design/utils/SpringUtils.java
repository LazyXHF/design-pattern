package com.xu.design.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/***
 *@Title SpringBean工具类
 *@Author 许小桀
 *@Date 2020/4/17 9:07
 **/
@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    //获取applicationContext
    public  ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    //通过name获取 Bean.
    public  Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public  <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public  <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }

}
