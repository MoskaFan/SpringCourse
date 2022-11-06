package aop.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution( public void getBook(aop.Book))")//PointCut
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: Try to get a book");
    }

}
