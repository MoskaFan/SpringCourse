package aop.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("aop.Aspect.MyPointCuts.allGetMethods()")//PointCut
    public void beforeGetLoginAdvice(){
        System.out.println("beforeGetBookAdvice: Try to get a book");
    }


//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromLibrary(){
//
//    }
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){
//
//    }
//    @Pointcut("allMethodsFromLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazinefromUniLibrary(){
//
//    }
//    @Before("allMethodsExceptReturnMagazinefromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazinefromUniLibrary(){
//        System.out.println("beforeAllMethodsExceptReturnMagazinefromUniLibrary: writing log#1");
//    }
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//        private void allGetMethodsFromUniLibrary(){}
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//        private void allGetAndReturnMethodsFromLibrary(){
//    }
//    @Before("allGetAndReturnMethodsFromLibrary()")
//        private void beforeGetAndReturnMethodsFromLibrary(){
//        System.out.println("beforeGetLoginAdvice: writing Log#3");
//    }
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoginAdvice(){
//        System.out.println("beforeGetLoginAdvice: writing Log#1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoginAdvice(){
//        System.out.println("beforeReturnLoginAdvice: writing Log#2");
//    }


}
