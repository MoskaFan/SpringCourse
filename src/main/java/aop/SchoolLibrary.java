package aop;

import org.springframework.stereotype.Component;

@Component ("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("We are taking a book from School Library");
    }
    public String getName(){
        System.out.println("The name is Julia");
        return "Julia";
    }
}
