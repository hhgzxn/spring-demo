package com.example.spring.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"com/example/spring/demo2/applicationContext.xml"});

        Student s = (Student) context.getBean("student");
        System.out.println(s.toString());
    }
}
