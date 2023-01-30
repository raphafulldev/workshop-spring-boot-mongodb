package com.raphael.workshopmongo.resources.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound (ObjectNotFoundException e, HttpServletRequest request){
        HttpStatus status =HttpStatus.NOT_FOUND;
        String error = "Not found";
        String msg = e.getMessage();
        StandardError err = new StandardError(Instant.now(), status.value(), error, msg, request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
