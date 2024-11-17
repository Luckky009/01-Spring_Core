package com.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       First_Spring first =(First_Spring)context.getBean("first");
       First_Spring second =(First_Spring)context.getBean("second");
       System.out.println(first);
       System.out.println(second);
    }
   }
