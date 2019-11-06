package cz.vsimanek.examples.javafaker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.NoSuchElementException;

/**
 * Global exception handler. When some exception is thrown then
 * catch it and return proper http status.
 *
 * In this example it only handles IllegalArgumentException for
 * person id duplication, when user tries to create user with
 * given ID and it is already exists. And NoSuchElementException
 * for get person with given ID.
 */
@ControllerAdvice
public class ExceptionHandlingController {

    /**
     * When user with given ID already exists exception IllegalArgumentException
     * is thrown and is caught by the handler and api endpoint return proper status
     * CONFLICT 409 with error message.
     */
    @ResponseStatus(value = HttpStatus.CONFLICT,
            reason = "User with this ID already exists!")  // 409
    @ExceptionHandler(IllegalArgumentException.class)
    public void conflict() {
        // Nothing to do
    }

    /**
     * When user with given ID does not exists NoSuchElementException
     * is thrown and is caught by the handler and api endpoint return proper status
     * NOT_FOUND 404 with error message.
     */
    @ResponseStatus(value = HttpStatus.NOT_FOUND,
            reason = "User with given ID does not exists!") // 404
    @ExceptionHandler(NoSuchElementException.class)
    public void notFound() {
        // Nothing to do
    }
}
