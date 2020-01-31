package com.vss.demodi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("I'm in Life Cycle Demo Bean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Life Cycle Demo Bean factory has set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Life Cycle Demo Bean name " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Life Cycle Demo Bean is getting destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Life Cycle Demo Bean has it's properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Life cylce demo bean applicationContest has set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("the post construct annotated method is called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("the pre destory annotated method is called");
    }

    public void beforeInit() {
        System.out.println("# Before Init called by post processor");
    }

    public void afterInit() {
        System.out.println("# After Init called by post processor");
    }
}
