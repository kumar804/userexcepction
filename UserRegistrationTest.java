package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    UserRegistrations userRegistration = new UserRegistrations();
    Scanner sc = new Scanner(System.in);

    @Test
    void given_Invalid_Password_Returns_Exception() {
        String password = "Kumar@123";
        try {
            userRegistration.validatePassword.validate(password);

        }
        catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.PASSWORD_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void given_Invalid_Email_Returns_Exception() {
        String email = "kumar@bl.co";
        try {
            userRegistration.validateEmailId.validate(email);
        }
        catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.EMAIL_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void  given_Invalid_Name_Returns_Exception() {
        String name = "Duggu";
        try {
            userRegistration.validateName.validate(name);
        }
        catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.NAME_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void namegiven_Invalid_LastName_Returns_Exception() {
        String lastName = "Singh";
        try{
            userRegistration.validateLastName.validate(lastName);
        }
        catch (UserRegistrationException e) {
            Assertions.assertTrue(UserRegistrationException.ExceptionType.NAME_NOT_VALID.equals(e.type));
        }
    }

    @Test
    void given_Invalid_Number_Returns_Exception() {
        String number = "918291871669";
        try {
            userRegistration.validatePhoneNum.validate(number);
        }
        catch (UserRegistrationException e){
            Assertions.assertTrue(UserRegistrationException.ExceptionType.NUMBER_NOT_VALID.equals(e.type));
        }
    }
}
