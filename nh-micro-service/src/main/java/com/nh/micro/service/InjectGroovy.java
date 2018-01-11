package com.nh.micro.service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD}) 
@Retention(RetentionPolicy.RUNTIME) 
@Documented

/**
 * 
 * @author ninghao
 *
 */
public @interface InjectGroovy {
public String name() default "";
}
