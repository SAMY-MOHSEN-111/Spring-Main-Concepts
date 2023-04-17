package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class ShowBeanLifeCycle implements InitializingBean, DisposableBean, BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization "+beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization "+beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    public void init() {
        System.out.println("Inside init method");
    }

    public void cleanup() {
        System.out.println("Inside cleanup method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroy");
    }
}
