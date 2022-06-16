package tn.esprit.ExamenSpring.Config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectAop {
    private static final Logger log= LogManager.getLogger(AspectAop.class);

    private long t1,t2;
    @Before("execution(* tn.esprit.ExamenSpring.Services.*.*(..))")
    public void before(JoinPoint joinPoint) {
        t1= System.currentTimeMillis();

    }



    @After("execution(* tn.esprit.ExamenSpring.Services.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        t2= System.currentTimeMillis();
        String name= joinPoint.getSignature().getName();

        log.info("Your method "+ name+ " has been launched" + "le temps d'execution" + Long.toString(t2-t1));
    }
}
