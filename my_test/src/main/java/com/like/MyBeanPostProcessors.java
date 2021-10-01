package com.like;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @program: spring
 * @description: hh
 * @author: Like
 * @create: 2021-09-30 00:50
 **/

public class MyBeanPostProcessors implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
