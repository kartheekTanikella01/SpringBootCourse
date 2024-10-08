package com.Thymleaf.ValidationDemo.Customvalidation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //define default course code
    public String value() default"LUV";

    //define default error message
    public String message() default "must start with LUV";

    //define groups(validatiopngroup constarint)
    public Class<?>[] groups() default {};

    //define default payloads(information about validation error)
    public Class<? extends Payload>[] payload() default{};


}
