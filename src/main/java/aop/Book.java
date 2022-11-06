package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")

public class Book {

    @Value("Catch the fire")
    private String name;

    public String getName() {
        return name;
    }
}
