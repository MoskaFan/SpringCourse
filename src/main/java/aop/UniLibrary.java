package aop;

import org.springframework.stereotype.Component;

@Component ("libraryBean")
public class UniLibrary extends AbstractLibrary{



    public void returnBook(){
        System.out.println("We are returning book to the Uni Library");
    }



    @Override
    public void getBook(Book book) {
        System.out.println("We are taking a book from School Library: " + book.getName());
    }
}
