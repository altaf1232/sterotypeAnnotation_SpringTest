package com.springcores;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcores/sterotypeA.xml");
          Student student=context.getBean("student",Student.class);
                           System.out.println(student);
           //here is your student class object put your getbean("")method              
    }
}
