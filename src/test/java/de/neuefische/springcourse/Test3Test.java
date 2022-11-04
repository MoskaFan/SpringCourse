package de.neuefische.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3Test {
    public static void main(String[] args) {
        //Pet pet = new Cat();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("MyPet", Pet.class);
        //Person person = new Person(pet);
        Person person = context.getBean("MyPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
