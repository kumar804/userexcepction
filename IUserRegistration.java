package com.bridgelabz;
@FunctionalInterface

public interface IUserRegistration {
    public Boolean validate(String data) throws UserRegistrationException;
}
