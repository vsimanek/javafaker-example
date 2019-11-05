package cz.vsimanek.examples.javafaker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandlingController {

    @ResponseStatus(value = HttpStatus.CONFLICT,
            reason = "User with this ID already exists!")  // 409
    @ExceptionHandler(IllegalArgumentException.class)
    public void conflict() {
        // Nothing to do
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User with given ID does not exists!")
    @ExceptionHandler(NoSuchElementException.class)
    public void notFound() {
        // Nothing to do
    }
}
