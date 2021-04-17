package com.mazicodes.employeemanager.exception;

/**
 * @author Emeka Nwachukwu
 * @Email enwachukwu@byteworks.com.ng
 * 4/9/2021-1:48 PM
 */

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
