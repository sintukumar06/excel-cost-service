package com.nscorp.cost.calculator.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class CustomRsponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity(getErrorBody(ex, status), HttpStatus.BAD_REQUEST);
    }

    private ErrorDetails getErrorBody(MethodArgumentNotValidException ex, HttpStatus status) {
        return ErrorDetails.builder().timestamp(new Date()).status(status.toString()).errors(getErrors(ex)).build();
    }

    private List<FieldError> getErrors(MethodArgumentNotValidException ex) {
        return ex.getBindingResult().getFieldErrors().stream()
                .map(e -> FieldError.builder().field(e.getField()).defaultMessage(e.getDefaultMessage()).build())
                .collect(Collectors.toList());
    }

}