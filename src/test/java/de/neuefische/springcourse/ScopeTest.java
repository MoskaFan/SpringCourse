package de.neuefische.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
Dog myDog = context.getBean("dogBean", Dog.class);
Dog yourDog = context.getBean("dogBean", Dog.class);
        System.out.println("Variables link to one object" + ((myDog==yourDog)));
        System.out.println(myDog);
        System.out.println(yourDog);
        context.close();
    }
}
