package com.ssm.demo.utils.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * 获取spring的application
 * @author pypua
 *
 */
public class ApplicationContextUtil implements ApplicationContextAware {
	private static ApplicationContext context;// 声明�?个静态变量保�?

	@SuppressWarnings("static-access")
	public void setApplicationContext(ApplicationContext contex)
			throws BeansException {
		this.context = contex;
	}

	public static ApplicationContext getContext() {
		return context;
	}
}