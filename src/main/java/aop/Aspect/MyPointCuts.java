package aop.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution( * get*())")//PointCut
    public void allGetMethods(){}
}
