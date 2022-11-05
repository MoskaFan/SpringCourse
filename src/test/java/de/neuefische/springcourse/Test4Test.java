package de.neuefische.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//singletone default bean, use for stateless objects
//prototype for stateful objects
public class Test4Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context2.getBean("MyPet", Dog.class);
       myDog.setName("Chappy");
        Dog yourDog = context2.getBean("MyPet", Dog.class);
       yourDog.setName("Stella");        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());
        System.out.println("Variables get link to one object? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        context2.close();
    }
}
