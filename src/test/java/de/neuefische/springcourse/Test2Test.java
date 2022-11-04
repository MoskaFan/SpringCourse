package de.neuefische.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("MyPet", Pet.class);
        pet.say();
        context.close();

    }
}
