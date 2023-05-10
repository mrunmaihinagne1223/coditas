package org.Anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context= new AnnotationConfigApplicationContext("SpringBean.xml");
//        Employee employee1 = (Employee) context.getBean("employee");
//        employee1.display();
        ApplicationContext context = new ClassPathXmlApplicationContext("did.xml");
        DID d = (DID) context.getBean("did");
        d.display();
//        System.out.println(d);


    }


}
