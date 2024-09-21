package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> excHandler(StudentException exc){
        //create StudenError Response
        StudentErrorResponse ex=new StudentErrorResponse();
        ex.setStatus(HttpStatus.NOT_FOUND.value());
        ex.setMessage(exc.getMessage());
        ex.setTimestamp(System.currentTimeMillis());
        //return responseEntity

        return new ResponseEntity<>(ex,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> exceptionHandle(Exception exc){
        StudentErrorResponse err=new StudentErrorResponse();
        err.setTimestamp(System.currentTimeMillis());
        err.setMessage(exc.getMessage());
        err.setStatus(HttpStatus.BAD_REQUEST.value());

        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
}
