package de.neuefische.springcourse;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("de.neuefische.springcourse")
public class MyConfig {
    @Bean
    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
