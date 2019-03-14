package com.lgs.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author : lgs
 * @date : 2019/3/14 11:34
 */
@Component
@Aspect
public class AspectLog {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectLog.class);

    @Pointcut(value = "execution(public * com.lgs.controller..*(..))")
    public void point() {
    }

    @Before(value = "point()")
    public void beforeMethod1(JoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        String requestURL = request.getRequestURL().toString();
        String method = request.getMethod();
        String remoteAddr = request.getRemoteAddr();
        String params = Arrays.asList(joinPoint.getArgs()).toString();
        LOGGER.info("requestURL:{}, method:{}, remoteAddr:{}, params:{}", requestURL, method, remoteAddr, params);

    }

    @AfterReturning(value = "point()", returning = "object")
    public void afterReturningMethod(Object object) {
        LOGGER.info(">>> 返回结果：{}", object.toString());
    }
}
