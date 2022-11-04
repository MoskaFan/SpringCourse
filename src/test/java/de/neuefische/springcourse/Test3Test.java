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
        System.out.println(person.getAge());
        System.out.println(person.getSurname());


        //Dependency via constructor
        //<constructor-arg ref="MyPet"></constructor-arg>
        //Dependency via setter
        //<property name="pet" ref="MyPet" />
        context.close();
    }
}
