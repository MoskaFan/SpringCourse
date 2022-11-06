package aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("aop.Aspect.MyPointCuts.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: check if the person can take the book from the library");
    }

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
