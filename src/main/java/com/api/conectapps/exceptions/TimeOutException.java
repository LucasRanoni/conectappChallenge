package com.api.conectapps.exceptions;

public class TimeOutException extends Exception{

    public TimeOutException(){
    }

    public TimeOutException(String message){
        super(message);
    }
}
