package org.cg.Exception;

public class UserNotFound extends RuntimeException{
    private String message;
    public UserNotFound(String msg){
        this.message = msg;
    }
}
