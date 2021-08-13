package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {
    /**
     * We are using a lambda function here.
     * validateName is a name for the method of class IUserRegistration
     * Similarly different strings are validated via different methods
     */
    IUserRegistration validateName = (String data) ->{
        String pattern = "^[A-Z][A-Za-z]{2,}";
        try{
            Pattern pattern1 = Pattern.compile(pattern); //Compiles Pattern we want to match
            Matcher m = pattern1.matcher(data); //matches the compiled patten with the user input
            Boolean matches = m.matches(); //Returns true if the user input matches the pttern
            return matches;
        }
        catch (Exception e) {
            throw new UserRegistrationException("First name is not valid", UserRegistrationException.ExceptionType.NAME_NOT_VALID);
        }

    };
    IUserRegistration  validateLastName = (String data)-> {
        String pattern = "^[A-Z][A-Za-z]{2,}";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        }
        catch (Exception e){
            throw new UserRegistrationException("Last Name is not Valid", UserRegistrationException.ExceptionType.lAST_NAME_NOT_VALID);
        }
    };
    IUserRegistration  validateEmailId = (String data)->{
        String pattern = "[a-zA-Z]{3}[A-Za-z_0-9+-.]*@[a-z]{2}[.][a-z]{2}[.]*[a-z]{0,2}$";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        }
        catch (Exception e) {
            throw new UserRegistrationException("Email ID is not valid", UserRegistrationException.ExceptionType.EMAIL_NOT_VALID);
        }
    };
    IUserRegistration validatePassword = (String data) ->{
        String pattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%&';?\\.\\(\\)]).{8,}$";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        }
        catch (Exception e){
            throw new UserRegistrationException("Password is not valid", UserRegistrationException.ExceptionType.PASSWORD_NOT_VALID);
        }
    };
    IUserRegistration validatePhoneNum = (String data) ->{
        String pattern = "^[0-9]{2}[0-9]{10}";
        try {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher m = pattern1.matcher(data);
            Boolean matches = m.matches();
            return matches;
        }
        catch (Exception e) {
            throw new UserRegistrationException("Phone Number is not valid", UserRegistrationException.ExceptionType.NUMBER_NOT_VALID);

        }
    };


}
