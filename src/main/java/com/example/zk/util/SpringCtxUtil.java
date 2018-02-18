package com.example.zk.util;

import org.springframework.context.ApplicationContext;

public class SpringCtxUtil {

	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		SpringCtxUtil.applicationContext = applicationContext;
	}
	
	public static <T> T getBean(Class<T> clazz){
		return applicationContext.getBean(clazz);
	}
	
    public static <T> T getBean(String name, Class<T> clazz){  
        return applicationContext.getBean(name, clazz); 
    }
	
}
