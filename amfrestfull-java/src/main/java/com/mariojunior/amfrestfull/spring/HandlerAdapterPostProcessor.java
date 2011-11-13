/**
 * 
 */
package com.mariojunior.amfrestfull.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.flex.http.AmfHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;


/**
 * @author Mario Junior
 *
 */
public class HandlerAdapterPostProcessor implements BeanPostProcessor
{
	/**
	 * {@inheritDoc}
	 */
//	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException
	{
		return bean;
	}

	/**
	 * {@inheritDoc}
	 */
//	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException
	{
		if (bean instanceof AnnotationMethodHandlerAdapter) {
			AnnotationMethodHandlerAdapter adapter = (AnnotationMethodHandlerAdapter) bean;
			HttpMessageConverter<?>[] converters = adapter.getMessageConverters();
			adapter.setMessageConverters((HttpMessageConverter<?>[]) ObjectUtils.addObjectToArray(converters, new AmfHttpMessageConverter()));
		}
		return bean;
	}

}
