package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	HelloService service = context.getBean(HelloService.class);
    	
    	System.out.println(service.getGreeting());
    	
    	context.close();
    }
}
