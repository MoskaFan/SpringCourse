package aop;

import org.springframework.stereotype.Component;

@Component ("libraryBean")
public class UniLibrary extends AbstractLibrary{


    public void getBook() {
        System.out.println("We are taking a book from Uni Library");
    }
    public void returnBook(){
        System.out.println("We are returning book to the Uni Library");
    }
}
