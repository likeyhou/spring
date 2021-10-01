package com.like;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description: hh
 * @author: Like
 * @create: 2021-09-30 00:49
 **/
@Component
public class MyBeanFactoryPostProcessors implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory.getBean("user"));
	}
}
