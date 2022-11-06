package de.neuefische.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//Autowired child-parent relation via constructor
//Autowired child-parent relation via setter, default contructor
//Autowired field of class

public class Test5Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
