package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("libraryBean", UniLibrary.class);
        SchoolLibrary newLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);

        Book book = context.getBean("book", Book.class);
        newLibrary.getName();
        library.getBook(book);
        newLibrary.getBook(book);
        library.returnBook();
        newLibrary.getMagazine("Times");

        context.close();
    }
}
