package aop;

import org.springframework.stereotype.Component;

@Component ("libraryBean")
public class UniLibrary extends AbstractLibrary{



    public void returnBook(){
        System.out.println("We are returning book to the Uni Library");
    }



    @Override
    public void getBook() {
        System.out.println("We are taking a book from Uni Library: " );
    }

    public void getMagazine(){
        System.out.println("We are taking a magazine from Uni Library: " );
    }
    public void returnMagazine(){
        System.out.println("We are returning a book to Uni Library: " );
    }

    public void addMagazine(){
        System.out.println("We are adding a magazine to Uni Library: " );
    }
    public void addBook(){
        System.out.println("We are adding a magazine to Uni Library: " );
    }
}
