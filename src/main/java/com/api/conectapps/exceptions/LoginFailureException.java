package com.api.conectapps.exceptions;

public class LoginFailureException extends Exception{

    public LoginFailureException(){
        super();
    }

    public LoginFailureException(String msj){
        super(msj);
    }
}
