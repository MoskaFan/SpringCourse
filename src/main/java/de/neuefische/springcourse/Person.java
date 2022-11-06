package de.neuefische.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {


    private Pet pet;
   @Value("${person.surname}")
    private String surname;
   @Value("${person.age}")
    private int age;
//    public Person() {
//      System.out.println("Person");
//   }
//@Autowired
    public Person( Pet pet) {
       this.pet = pet;
    }
    //@Qualifier("catBean")

    public void setPet(Pet pet) {
        System.out.println("Class Person set Pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
