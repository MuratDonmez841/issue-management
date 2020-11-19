package com.cakestudios.deneme.advice;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
@Slf4j
public class IMExcaptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<?> handleExceptions(Exception ex, WebRequest request) {
        // Log.error(" Controller Advice -> Exception Handler -> Param: ",ex,request);
        ExceptionsResponse exceptionsResponse = new ExceptionsResponse(new Date(), ex.getMessage());
        return new ResponseEntity<>(exceptionsResponse, HttpStatus.EXPECTATION_FAILED);
    }
}
