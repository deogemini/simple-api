package com.amala.demo.exception;

public class InstitutionNotFoundException extends RuntimeException{

    public InstitutionNotFoundException(String legalName) {
        super("Holiday with identifier" + legalName+"does not exist");
    }
}
