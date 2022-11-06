package de.neuefische.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        //(Dog myDog = context.getBean("dogBean", Dog.class);
       // myDog.say();
        Pet myKitty = context.getBean("catBean", Cat.class);
        Pet pet = context.getBean("catBean", Cat.class);
        System.out.println(pet);
        System.out.println(myKitty);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        person.setPet(myKitty);
        pet.say();
        myKitty.say();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        System.out.println(person.getPet());
        context.close();

    }
}
