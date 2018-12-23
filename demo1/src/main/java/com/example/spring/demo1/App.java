package com.example.spring.demo1;

import com.example.spring.demo.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"com/example/spring/demo1/applicationContext.xml"});

        OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
        output.generateOutput();
    }
}
