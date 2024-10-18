package com.example.todoapi.controller.advice;

import com.example.todoapi.model.ResourceNotFoundError;
import com.example.todoapi.service.task.TaskEntityNotFountException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(TaskEntityNotFountException.class)
    public ResponseEntity<ResourceNotFoundError> handleTaskEntityNotFoundException(TaskEntityNotFountException e) {
        var error = new ResourceNotFoundError();
        error.setDetail(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
