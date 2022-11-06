package aop;

import org.springframework.stereotype.Component;

@Component ("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary{
    private String bookName;


    public void getMagazine(String magazinName) {
        System.out.println("We are taking a book from School Library: " + magazinName);
    }
    public String getName(){
        System.out.println("The name is Julia");
        return "Julia";
    }


    @Override
    public void getBook(Book book) {
        System.out.println("We are taking a book from School Library: " + book.getName());
    }
}
