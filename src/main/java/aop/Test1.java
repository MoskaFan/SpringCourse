package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("libraryBean", UniLibrary.class);
        SchoolLibrary newLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        newLibrary.getBook();
        newLibrary.getName();
        library.getBook();
        library.returnBook();

        context.close();
    }
}
