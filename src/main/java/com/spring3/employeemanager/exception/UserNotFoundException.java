package com.spring3.employeemanager.exception;


public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
//        Call constructor of message from super class
        super(message);
    }
}
