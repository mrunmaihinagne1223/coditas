package org.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person);
        System.out.println(person.getProperties());

    }
}
