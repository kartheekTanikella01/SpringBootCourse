package com.Thymleaf.ValidationDemo.Customvalidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;



public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {
    private String courseprefix;
    @Override
    public void initialize(CourseCode theCourseCode) {
        courseprefix=theCourseCode.value();//to give the attribute value
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode != null){
            result=theCode.startsWith(courseprefix);
        }else {
            result=true;
        }
        return result;
    }
}
