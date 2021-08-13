package com.bridgelabz;

public class UserRegistrationException extends Exception{

    ExceptionType type;

/**
 * @ExceptionType
 * This enum shows the different types of errors.
 */
enum ExceptionType {
    NAME_NOT_VALID, lAST_NAME_NOT_VALID, EMAIL_NOT_VALID, PASSWORD_NOT_VALID, NUMBER_NOT_VALID;
}
    /**
     * @UserRegistrationException
     * This function outputs the error message
     * Stores the error type in type variable
     */
    public UserRegistrationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
