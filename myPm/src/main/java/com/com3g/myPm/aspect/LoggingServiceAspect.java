package com.com3g.myPm.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * 
 * @author simu
 *
 */
@Aspect
@Component
public class LoggingServiceAspect {

    protected final Logger logger = Logger.getLogger("Service LOG");
    
   // @Around("execution(* com.com3g.myPm.service..*(..))")
    public Object serviceLogAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

	StopWatch stopWatch = new StopWatch();
	stopWatch.start();

	Object retVal = joinPoint.proceed();

	stopWatch.stop();

	StringBuffer logMessage = new StringBuffer();
	logMessage.append(joinPoint.getTarget().getClass().getName());
	logMessage.append(".");
	logMessage.append(joinPoint.getSignature().getName());
	logMessage.append("(");
	// append args
	Object[] args = joinPoint.getArgs();
	for (int i = 0; i < args.length; i++) {
	    logMessage.append(args[i]).append(",");
	}
	if (args.length > 0) {
	    logMessage.deleteCharAt(logMessage.length() - 1);
	}

	logMessage.append(")");
	logMessage.append(" execution time: ");
	logMessage.append(stopWatch.getTotalTimeMillis());
	logMessage.append(" ms");
	logger.info(logMessage.toString());
	return retVal;
    }
}
